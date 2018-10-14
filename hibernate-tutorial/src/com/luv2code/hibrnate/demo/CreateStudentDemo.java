package com.luv2code.hibrnate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
SessionFactory factory = new Configuration()
.configure("hibernate.cfg.xml")
.addAnnotatedClass(Student.class)
.buildSessionFactory();
	
Session session = factory.getCurrentSession();

try {
	System.out.println("Creating new student object");
	Student student = new Student("khaled", "esmail", "khaledesmail89@gmail.com");
	
	session.beginTransaction();
	List<Student> theStudents = session.createQuery("from Student").list(); 
	
	displayStudents(theStudents);
	
	theStudents = session.createQuery("from Student s where s.lastName='esmail'").list();
	System.out.println("students who have last name ail");
	displayStudents(theStudents);

	theStudents = session.createQuery("from Student s where s.lastName='esmail' OR s.firstName='ziad'").list();
	System.out.println("students who have last name esmail or first name ziad");
	displayStudents(theStudents);
	
	theStudents = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").list();
	System.out.println("students who have email end with gmail.com");
	displayStudents(theStudents);
	
	session.getTransaction().commit(); 
	System.out.println("Done!!");
} finally {
factory.close();
}

	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tmpStudent : theStudents) {
			System.out.println(tmpStudent);
		}
	}

}

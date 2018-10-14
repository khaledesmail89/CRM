package com.luv2code.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
SessionFactory factory = new Configuration()
.configure("hibernate.cfg.xml")
.addAnnotatedClass(Student.class)
.buildSessionFactory();
	
Session session = factory.getCurrentSession();

try {
	System.out.println("Creating new student object");
	Student student = new Student("ziad", "amer", "ziadAmer@gmail.com");
	
	session.beginTransaction();
	session.save(student);
	session.getTransaction().commit(); 
	
	//My new Code..
	System.out.println("saved student Generated Id: "+ student.getId());
	session = factory.getCurrentSession();
	session.beginTransaction();
	Student returnedStudent = session.get(Student.class, student.getId());
	System.out.println("Get Complete: "+ returnedStudent);
	session.getTransaction().commit();
	
	System.out.println("Done!!");
} finally {
factory.close();
}

	}

}

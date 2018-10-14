package com.luv2code.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

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
	session.save(student);
	session.getTransaction().commit(); 
	System.out.println("Done!!");
} finally {
factory.close();
}

	}

}

package com.luv2code.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
					
				Session session = factory.getCurrentSession();

				try {
					System.out.println("Creating new student object");
					Student student1 = new Student("khaled1", "esmail1", "khaledesmail89@gmail.com");
					Student student2 = new Student("ali", "esmail2", "ali@gmail.com");
					Student student3 = new Student("hussein", "esmail3", "hussein@gmail.com");

					session.beginTransaction();
					session.save(student1);
					session.save(student2);
					session.save(student3);
					session.getTransaction().commit(); 
					System.out.println("Done!!");
				} finally {
				factory.close();
				}
	}

}

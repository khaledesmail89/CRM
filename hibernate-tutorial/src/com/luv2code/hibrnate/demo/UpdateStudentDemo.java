package com.luv2code.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			int studentId = 1;
			session.beginTransaction();
			session.getTransaction().commit();

			// My new Code..
			System.out.println("Get student with Id: " + studentId);
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student returnedStudent = session.get(Student.class, studentId);
			System.out.println("Get Complete: " + returnedStudent);
			System.out.println("update first name");
			returnedStudent.setFirstName("hossam");
			session.getTransaction().commit();

			// NEW CODE
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("update email for all students");
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			session.getTransaction().commit();

			System.out.println("Done!!");
		} finally {
			factory.close();
		}

	}

}

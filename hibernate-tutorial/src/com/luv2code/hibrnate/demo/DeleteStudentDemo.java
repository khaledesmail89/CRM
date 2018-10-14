package com.luv2code.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			System.out.println("delete student " + returnedStudent);
			// session.delete(returnedStudent);
			session.createQuery("delete from Student where id=2").executeUpdate();
			session.getTransaction().commit();

			// NEW CODE

			System.out.println("Done!!");
		} finally {
			factory.close();
		}

	}

}

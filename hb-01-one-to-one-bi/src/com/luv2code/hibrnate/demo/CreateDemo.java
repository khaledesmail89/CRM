package com.luv2code.hibrnate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("Creating new instructor object");
			Instructor instructor = new Instructor("khaled", "esmail", "luv2code@gmail.com");
			InstructorDetail instructorDetail = new InstructorDetail("http://youtube.com", "luv2code!!");

			instructor.setInstructorDetail(instructorDetail);
			session.beginTransaction();
			System.out.println("saving instructor !!" + instructor);
			session.save(instructor);
			session.getTransaction().commit();
			System.out.println("Done!!");
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tmpStudent : theStudents) {
			System.out.println(tmpStudent);
		}
	}

}

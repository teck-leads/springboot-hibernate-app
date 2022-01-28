package com.techleads.app.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.techleads.app.model.Student;
import com.techleads.app.util.HibernateUtil;

public class StudentRepository {
	public void saveStudent(Student student) {
        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            Serializable save = session.save(student);
            System.out.println(save.getClass());
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List < Student > findAll() {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
    	try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
    		session.beginTransaction();
             List<Student> students = session.createQuery("from student", Student.class).list();
            session.getTransaction().commit();
            return students;
        }
    }
    
    public Student findById(Integer id) {
//    	try (Session session =HibernateUtil.getSessionFactory().openSession()){
    	try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
    		session.beginTransaction();
    		Student student = session.get(Student.class, id);
    		session.getTransaction().commit();
    		return student;
    	}
    }

}

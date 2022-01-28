package com.techleads.app.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.techleads.app.model.Student;
import com.techleads.app.util.HibernateUtil;

public class StudentRepository {
	public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(student);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List < Student > getStudents() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from student", Student.class).list();
        }
    }

}

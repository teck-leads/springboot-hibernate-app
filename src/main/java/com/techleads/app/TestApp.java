package com.techleads.app;

import java.util.List;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

public class TestApp {

	public static void main(String[] args) {
		StudentRepository studentDao = new StudentRepository();
	        Student s1 = new Student("teja", "teja", "teja@ibm.com");
	        Student s2 = new Student("madhav", "anupoju", "madhav@tm.com");
	        Student s3 = new Student("dill", "anupoju", "dill@us.com");
	        studentDao.saveStudent(s1);
	        studentDao.saveStudent(s2);
	        studentDao.saveStudent(s3);
	        

	        List < Student > students = studentDao.getStudents();
	       
	        students.forEach(System.out::println);
	}

}

package com.techleads.app;

import java.util.List;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

public class TestApp {

	public static void main(String[] args) {
		StudentRepository studentDao = new StudentRepository();
	        Student student = new Student(101,"madhav", "anupoju", "madhav@tm.com");
	        studentDao.saveStudent(student);

	        List < Student > students = studentDao.getStudents();
	       
	        students.forEach(System.out::println);
	}

}

package com.techleads.app;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

import java.util.List;

public class UpdateStudent {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();
//		System.out.println(repository.findById(2));
//		Student findById = repository.updateStudentById(2);
//		System.out.println(repository.findById(2));
		
		int updateStudentEmailIds = repository.updateStudentEmailIds();
		System.out.println(updateStudentEmailIds);
		
	 
	}

}

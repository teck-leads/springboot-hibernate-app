package com.techleads.app;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

import java.util.List;

public class ReadStudent {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();
		Student findById = repository.findById(2);

		System.out.println(findById);
		System.out.println("==========");
	        List < Student > students = repository.findByLastName();
	       
	        students.forEach(System.out::println);
	 
	}

}

package com.techleads.app;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

public class DeleteStudent {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();
		System.out.println(repository.findById(2));
		Student findById = repository.findById(2);
		repository.deleteStudentById(findById.getId());
		System.out.println("After deleting ");
		System.out.println(repository.findById(2));
		
		
		
	 
	}

}

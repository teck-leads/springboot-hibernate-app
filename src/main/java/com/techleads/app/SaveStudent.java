package com.techleads.app;

import java.util.List;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

public class SaveStudent {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();
        Student s1 = new Student("teja", "teja", "teja@ibm.com");
        Student s2 = new Student("madhav", "anupoju", "madhav@tm.com");
        Student s3 = new Student("dill", "anupoju", "dill@us.com");
        repository.saveStudent(s1);
        repository.saveStudent(s2);
        repository.saveStudent(s3);
	        
		
	}

}

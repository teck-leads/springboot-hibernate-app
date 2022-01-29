package com.techleads.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import com.techleads.app.model.Student;
import com.techleads.app.repository.StudentRepository;

public class SaveStudent {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepository();
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 29);
        Student s1 = new Student("teja", "teja", "teja@ibm.com",asDate(date));
        date = LocalDate.of(2022, Month.FEBRUARY, 25);
        Student s2 = new Student("madhav", "anupoju", "madhav@tm.com",asDate(date));
        date = LocalDate.of(2022, Month.MARCH, 12);
        Student s3 = new Student("dill", "anupoju", "dill@us.com",asDate(date));
        repository.saveStudent(s1);
        repository.saveStudent(s2);
        repository.saveStudent(s3);
	        
		
	}

	
	public static Date asDate(LocalDate localDate) {
	    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	  }
}

package com.demo.spring_jpa;

import java.util.List;

public class StudentClient {
	private final StudentRepository repository;
	
	StudentClient(StudentRepository repository) {
		this.repository = repository;
	}
	
	public void doSomething() {
		repository.save(new Student("Andy", "Rivera", "rivera.andy40@gmail.com", 24));
		
		List<Student> students = repository.findByLastName("Rivera");
		
		for (Student student : students) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
	}
}

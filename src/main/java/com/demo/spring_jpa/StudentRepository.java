package com.demo.spring_jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByLastName(String lastName);
}

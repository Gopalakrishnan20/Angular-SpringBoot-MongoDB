package com.asm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.asm.models.Student;
import com.asm.service.StudentService;


@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping
	List<Student> fetchAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/{email}")
	Optional<Student> fetchStudentByEmail(@PathVariable String email) {
		Optional<Student> data=service.getStudentByEmail(email);
		if(data.isPresent())
		return data;
		else
			return null;
	}
	
	@PostMapping
	String addStudent(@RequestBody Student s) {
		return service.addStudent(s);
	}
	
	@DeleteMapping
	String deleteAllStudents() {
		return service.deleteAllStudents();
	}
	
	@DeleteMapping("/{id}")
	String deleteStudentById(@PathVariable("id") String id) {
		return service.deleteById(id);		
	}
	
	@PutMapping
	Student updateStudent(@RequestBody Student newData) {
		return service.updateStudent(newData);
	}

	
}

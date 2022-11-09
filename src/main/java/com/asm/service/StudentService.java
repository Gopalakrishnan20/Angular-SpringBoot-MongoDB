package com.asm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.models.Student;
import com.asm.repository.StudentRepository;

@Service 
public class StudentService {
	
	@Autowired
	StudentRepository repo;

	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	public String addStudent(Student s) {
		if(repo.findByEmail(s.getEmail()).isEmpty()) {
			repo.save(s);
			return "Inserted";
		}
		else {
			return s.getEmail()+" Already Exists";
		}
		
	}
	
	public Optional<Student> getStudentByEmail(String email){
		return repo.findByEmail(email);
	}
	
	public String deleteAllStudents() {
		int count=repo.findAll().size();
		repo.deleteAll();
		return count+" Records Deleted";
	}
	
	public String deleteById(String id) {
		boolean record=repo.findById(id).isEmpty();
		if(record) {
			return id+"Does't Exists";
		}
		else {
			repo.deleteById(id);
			return "Records of "+id+" is deleted.";
		}
		
	}
	
	public Student updateStudent(Student newData,String id) {
		Student oldData=repo.findById(id).get();				;
		oldData.setFirstName(newData.getFirstName());
		oldData.setLastName(newData.getLastName());
		oldData.setEmail(newData.getEmail());
		oldData.setGender(newData.getGender());
		oldData.setAddress(newData.getAddress());
		oldData.setFavouriteSubjects(newData.getFavouriteSubjects());
		oldData.setTotalSpentInBooks(newData.getTotalSpentInBooks());
		oldData.setCreated(newData.getCreated());
		repo.save(oldData);
		return oldData;
		
	}
	
}

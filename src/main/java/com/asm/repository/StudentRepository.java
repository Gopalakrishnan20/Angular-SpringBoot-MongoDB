package com.asm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.asm.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	
	Optional<Student> findByEmail(String email);

}

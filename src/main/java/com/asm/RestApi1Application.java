package com.asm;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.asm.models.Address;
import com.asm.models.Gender;
import com.asm.models.Student;
import com.asm.repository.StudentRepository;

@SpringBootApplication
public class RestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApi1Application.class, args);
	}

//	@Bean
//	CommandLineRunner runner(StudentRepository repo, MongoTemplate mongoTemplate) {
//		return args->{
//			Address address=new Address(
//					"India",
//					"Madurai",
//					"625106"
//					);
//			Student student=new Student( 
//					"Gopalakrishnan",
//					"J",
//					"gk@gmail.com",
//					Gender.MALE,
//					address,
//					List.of("ComputerScience,Ethical Hacking"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//					);
//			
//			List<Student> students=repo.findByEmail(student.getEmail());
//			if(students.size()>=1)
//			{
//				throw new IllegalStateException("Email"
//						+ student.getEmail()+" Already Exists");
//			}
//			if(students.isEmpty()) {
//				System.out.println("Record Inserted");
//				System.out.println(student);
//				repo.insert(student); 
//			}
//			 
//					
//		};
//	}
	
}

package com.crud_demo_9AM_project;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud_demo_9AM_project.entity.Student;
import com.crud_demo_9AM_project.repository.StudentRepository;

@SpringBootTest
class CrudDemo9AmProjectApplicationTests {

	@Autowired
	
	private StudentRepository studentRepo;
//	//@Test
//	//void saveReg() {
//		
//	//	Student s = new Student();
//		s.setName("Ajay Sharma");
//		s.setCourse("Testing Engineer");
//		s.setFee(30000);
//		
//		studentRepo.save(s);
//	}
//     @Test
//	void deleteReg() {
//		studentRepo.deleteById(2L);
//	}
	
//	@Test
//	void readReg() {
//		
//		Optional<Student> findById = studentRepo.findById(1L);
//		Student student = findById.get();
//		
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getCourse());
//		System.out.println(student.getFee());
//	}
	
	@Test
	
	void updateReg() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
		student.setCourse("Testing");
		
		studentRepo.save(student);
	}
	
}

package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
//	http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Dhruv","Shah");
	}
	
//	http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		
		List<Student> studnets=new ArrayList<>();
		studnets.add(new Student("Dhruv","Shah"));
		studnets.add(new Student("Monal","Shah"));
		studnets.add(new Student("Deep","Shah"));
		
		return studnets;
	}
	
//	http://localhost:8080/student/dhruv/shah
//	@PathVariable
//	URI template variable
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studnetPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
//	build rest API to handle query parameters
//	http://localhost:8080/student/query?firstName=dhruv&lastName=shah
	@GetMapping("/student/query")
	public Student studentQueryParams(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	
}

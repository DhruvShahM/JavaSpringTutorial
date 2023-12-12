package com.springboot.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoombookDemoSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoombookDemoSetApplication.class, args);
		
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Dhruv");
		student.setLastName("Shah");
		
		System.out.println(student);
	}

}

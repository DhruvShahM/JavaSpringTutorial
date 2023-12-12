package com.springboot.war;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//@Setter
//@Getter
//@AllArgsConstructor
//@EqualsAndHashCode

@Data
public class Student {
	
	private long id;
	private String firstName;
	private String lastName;

}

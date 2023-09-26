package com.example.demo.webflux.app.openapi.student;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@Table(name = "students")
public class Student {
	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	private int age;
}
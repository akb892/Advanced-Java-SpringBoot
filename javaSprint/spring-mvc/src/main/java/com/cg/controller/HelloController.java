package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Student;

//@Controller
@RestController  // if used we don't have to use @Response Body as it does the work
@RequestMapping("hello") // checks if there is hello in the response then only check this controller
public class HelloController {
	
//	@GetMapping("hi/{n}")
//	public @ResponseBody String sayHello(@PathVariable(name = "n") String name) {
//		return "Hello Spring MVC " +  name;
//	}
//	
//	@RequestMapping("hi2")
//	public String sayHello2() {
//		return "Hello";
//	}
	
	
	@GetMapping
	public String sayHello() {
		return "Hello";
	}
	
	
	@GetMapping("/name/{n}")
	public String sayHello(@PathVariable(name = "n") String name) {
		return "Hello Spring MVC " +  name;
	}
	
	@GetMapping("/city/{city}")
	public String sayHello1(@PathVariable String city) {
		return "Your City " + city;
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student(101,"Aryan",89);
	}
}

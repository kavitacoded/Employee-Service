package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	
	@Value("${dbuser}")
	private String user;
	
	@GetMapping("/show")
	public ResponseEntity<?> showEmployeePage(){
		return new ResponseEntity<String>("Employee "+ user,HttpStatus.OK);
	}
	
}

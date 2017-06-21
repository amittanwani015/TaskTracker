package com.tasktracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/testme")
	public String testHibernate(){
		return null;
	}
	
}

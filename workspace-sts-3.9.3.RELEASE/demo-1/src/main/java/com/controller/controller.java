package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Value("${name}")
	private String name;
	
	@RequestMapping("/hello")
	public String index() {
		return "helloworld,"+name;
				
	}
}

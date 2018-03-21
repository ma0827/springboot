package com.msoft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("HelloWorld")
	public String HelloWorld(){
		return "hello world";
	}
	
}

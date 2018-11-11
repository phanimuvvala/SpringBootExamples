package com.gss.egp.cptu.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi(){
		return "Welcome To Java Spring Boot Rest Example";
	}
}

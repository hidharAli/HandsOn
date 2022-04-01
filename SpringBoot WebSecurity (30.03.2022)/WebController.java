package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController
{
	@GetMapping("/demo")

	public String data()
	{
		return "<body bgcolor='red' text='black'><h1>welcome to learn spring websecurity</h1><h5>Easy to learn spring boot</h5></body>";
		
	}
}

package com.cooperstrahan.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/hello/method", method=RequestMethod.GET)
	public String world() {
		return "Class level annotations are cool too!";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for: nothing";
		} else {
			return "You searched for: " + searchQuery;
		}
	}
	
	@RequestMapping("/coding")
	public String code() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/coding/java")
	public String j() {
		return "Java/Spring is better!";
	}	
	
}


package com.cooperstrahan.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/burbank-dojo")
	public String burbank() {
		return "The burbank dojo is in southern california!";
	}
	
	@RequestMapping("/seattle-dojo")
	public String seattle() {
		return "The seattle dojo is the headquarters";
	}
}

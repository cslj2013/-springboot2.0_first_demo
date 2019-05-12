package com.springboot2demo.second;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@RequestMapping("/secondIndex")
	public String index() {
		return "secondIndex info";
	}
	
}

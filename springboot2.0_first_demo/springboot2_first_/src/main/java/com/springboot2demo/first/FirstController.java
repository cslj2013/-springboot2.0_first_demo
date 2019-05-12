package com.springboot2demo.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/firstIndex")
	public String index() {
		return "firstIndex info";
	}
	
}

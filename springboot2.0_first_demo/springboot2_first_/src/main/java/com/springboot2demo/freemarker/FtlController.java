package com.springboot2demo.freemarker;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //注意：不能使用@RestController(没有视图层)，否则无法找到对应的ftl模板，类似jsp
public class FtlController {

	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String, Object> map) {
		map.put("name", "test");//相当于request.setName()
		map.put("age", "2");
		return "ftlIndex";//自动查找对应的页面，类似jsp
	}
	
}

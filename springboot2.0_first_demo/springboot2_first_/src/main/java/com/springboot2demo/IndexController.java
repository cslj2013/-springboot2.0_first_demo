package com.springboot2demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 仅 @EnableAutoConfiguration注解方式下启动(默认只扫描当前类)，/index 访问报错
 * @author admin
 */
@RestController
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "index info";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "springboot2.0 first application";
	}

}

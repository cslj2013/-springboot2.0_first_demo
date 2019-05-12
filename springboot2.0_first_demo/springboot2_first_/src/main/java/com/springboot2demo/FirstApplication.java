package com.springboot2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@SpringBootApplication //或使用@EnableAutoConfiguration配置
@EnableAutoConfiguration //自动配置,根据pom文件引入的依赖信息,自动配置对应的组件;扫包范围，默认在当前类中
@ComponentScan("com.springboot2demo") //指定扫描范围
public class FirstApplication {

	/**
	 * 程序入口
	 *  SpringApplication.run 相当于java代码创建内置tomcat，加载springmvc注解启动
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}

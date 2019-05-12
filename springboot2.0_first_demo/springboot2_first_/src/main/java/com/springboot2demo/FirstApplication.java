package com.springboot2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
//@EnableAutoConfiguration //自动配置,根据pom文件引入的依赖信息,自动配置对应的组件;扫包范围，默认在当前类中
//@ComponentScan("com.springboot2demo") //指定扫描范围
//@ComponentScan(basePackages= {"com.springboot2demo.first","com.springboot2demo.second"}) //多包扫描
@SpringBootApplication //或使用@EnableAutoConfiguration+@ComponentScan配置;@SpringBootApplication范围默认当前类所在包及子包下所有类
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

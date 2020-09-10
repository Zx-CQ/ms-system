package com.jd.jsl.dd.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.jd.jsl.dd"})
public class JslDdWorkbenchWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JslDdWorkbenchWebApplication.class, args);
	}

}

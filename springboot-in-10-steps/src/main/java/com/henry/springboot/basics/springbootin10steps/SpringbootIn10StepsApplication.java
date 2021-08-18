package com.henry.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringbootIn10StepsApplication.class, args);

 //		Arrays.stream(ac.getBeanDefinitionNames()).forEachOrdered(System.out::println);
	}

}

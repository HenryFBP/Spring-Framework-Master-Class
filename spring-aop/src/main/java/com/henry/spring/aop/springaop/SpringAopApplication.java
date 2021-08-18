package com.henry.spring.aop.springaop;

import com.henry.spring.aop.springaop.business.Business1;
import com.henry.spring.aop.springaop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	//this method gets run when the app gets launched
	@Override
	public void run(String... args) throws Exception {
		System.out.println("I'm a CommandLineRunner!");

		logger.info(business1.calcSomething());
		logger.info(business2.calcSomething());
	}
}

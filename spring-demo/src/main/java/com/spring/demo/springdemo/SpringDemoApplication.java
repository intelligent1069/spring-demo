package com.spring.demo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl BinSearch = new BinarySearchImpl(new BubbleSort());
		
		ConfigurableApplicationContext applContext = 
					SpringApplication.run(SpringDemoApplication.class, args);
		BinarySearchImpl binsearch = applContext.getBean(BinarySearchImpl.class);
		int result = binsearch.binSearch(new int[] {1,234,4,5}, 3);
		System.out.println(result);
		
	}

}


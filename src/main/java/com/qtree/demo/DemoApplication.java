package com.qtree.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("I am good");

		Student s1 = new Student();

		s1.setId(1);
		s1.setFirstName("Kannan");
		s1.setLastName("Kumar");

		System.out.println(s1.getId());
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());


	}

}

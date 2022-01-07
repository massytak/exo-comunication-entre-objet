package com.f2i;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.f2i.service.IGuichet;

@SpringBootApplication
public class Application implements  CommandLineRunner{
	@Autowired
	IGuichet guichet;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello word");
		
	}

}

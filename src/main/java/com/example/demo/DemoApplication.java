package com.example.demo;

import com.example.demo.model.Coche;
import com.example.demo.repository.CocheInterfase;
import com.example.demo.service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private static CocheService cocheService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}

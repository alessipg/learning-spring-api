package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student maria = new Student("Maria","maria@gmail.com",LocalDate.of(2004, Month.JANUARY, 5));
			Student pedro = new Student("Pedro","pedro@gmail.com",LocalDate.of(1995, Month.JULY, 7));
			Student jose = new Student("Jose","jose@gmail.com",LocalDate.of(2003, Month.MARCH, 21));
			repository.saveAll(List.of(maria,pedro,jose));
		};
	}
} 

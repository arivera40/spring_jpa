package com.demo.spring_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    public CommandLineRunner demo(StudentRepository studentRepository) {
    	return (args) -> {
			StudentClient studentClient = new StudentClient(studentRepository);
			
			studentClient.doSomething();
    	};
    }
}

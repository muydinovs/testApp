package com.example.springwithreact.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            for (int i = 0; i < 15; i++) {
                Student student = new Student(
                        (long)i,
                        "Umidjon",
                        "muydinov" + i,
                        Gender.MALE
                );
                studentRepository.save(student);
            }
        };
    }
}

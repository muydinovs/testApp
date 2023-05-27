package com.example.springwithreact.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){
        return Arrays.asList(
                new Student(
                        1L,
                        "Umidjon",
                        "umidjon@gmail.com",
                        Gender.MALE
                ),
                new Student(
                        2L,
                        "Boburjon",
                        "boburjon@gmail.com",
                        Gender.MALE
                )
        );
    }
}

package com.comclinic.SpringBootProject1.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FirstProject {

    @GetMapping("/firstproject")
    public List<Course>getAllCourses()
    {
        return Arrays.asList(new Course(1,"Project","Gayathri"));
    }
}

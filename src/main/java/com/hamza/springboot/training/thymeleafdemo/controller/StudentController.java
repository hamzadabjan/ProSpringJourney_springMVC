package com.hamza.springboot.training.thymeleafdemo.controller;


import com.hamza.springboot.training.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${operatingsystems}")
    private List<String> operatingsystems;

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model themodel){

        Student theStudent =new Student();
        themodel.addAttribute("student",theStudent);
        themodel.addAttribute("countries",countries);
        themodel.addAttribute("languages",languages);
        themodel.addAttribute("operatingsystems",operatingsystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm (@ModelAttribute("student") Student theStudent){
        System.out.printf("The Student Name is "+theStudent.getFirstName()+" "+theStudent.getLastName());

        return "confirmation-page";
    }
}

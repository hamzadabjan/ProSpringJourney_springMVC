package com.hamza.springboot.training.thymeleafdemo.controller;


import com.hamza.springboot.training.thymeleafdemo.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${operatingsystems}")
    private List<String> operatingsystems;


    @InitBinder
    public void initBinder (WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel){

        Student theStudent =new Student();
        theModel.addAttribute("student",theStudent);
        theModel.addAttribute("countries",countries);
        theModel.addAttribute("languages",languages);
        theModel.addAttribute("operatingsystems",operatingsystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm (@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult, Model theModel){
        if (theBindingResult.hasErrors()) {
            theModel.addAttribute("countries",countries);
            theModel.addAttribute("languages",languages);
            theModel.addAttribute("operatingsystems",operatingsystems);
            return "student-form";
        }
        else {
            return "confirmation-page";
        }
    }
}

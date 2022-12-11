package com.lewis.controller;


import com.lewis.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/showform")
    public String showForm(Model theModel)
    {
        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "student/student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student, Model model)
    {

        model.addAttribute("student",student);

        return "student/student-confirmation";
    }
}

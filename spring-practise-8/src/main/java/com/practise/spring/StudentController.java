package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
@Controller
//@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/")
    public String mainPage() {
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Student theStudent = new Student();
        model.addAttribute("studentAttr", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("studentAttr") Student theStudent) {
        System.out.println("Processing part got executed, fName: " +theStudent.getlName()+
                " and lName: " +theStudent.getlName());
        return "student-confirmation";
    }
}

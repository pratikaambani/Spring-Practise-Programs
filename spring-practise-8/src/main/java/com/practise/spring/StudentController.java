package com.practise.spring;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
    public String processForm(@Valid @ModelAttribute("studentAttr") Student theStudent,
                              BindingResult theBindingResult) {
        System.out.println("Processing part got executed, fName: " +theStudent.getlName()+
                " and lName: " +theStudent.getlName());

        if(theBindingResult.hasErrors()) {
            return "student-form";

        } else {
            return "student-confirmation";
        }
    }

    @InitBinder
    //TODO 034 Preprocesses every String form data
    //TODO 034 Removes leading and trailing WhiteSpaces
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
}

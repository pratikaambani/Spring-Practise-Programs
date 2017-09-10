package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
@Controller
public class HelloWorldController {

    /*will form url: http://localhost:8080/showForm*/
    @RequestMapping("/showForm")
    public String showForm() {
        return "hello-world-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        System.out.println("This is in processForm(): ");
        return "processedPage";
    }

    @RequestMapping("/processFormToUpperCase")
    public String processForm(HttpServletRequest request, Model model) {
        System.out.println("This is in processForm(HttpServletRequest): " +request.getParameter("studentName"));
        //TODO 025 instead of name, anything can be placed, but use this string in jsp while retrieving
        model.addAttribute("name", request.getParameter("studentName").toUpperCase());
        return "processedPage";
    }

    @RequestMapping("/processToUpperCase")
    public String processForm(
            @RequestParam("studentName") String nameOfStudent,
            Model model) {
        System.out.println("This is in processForm(@RequestParam): " +nameOfStudent);
        //TODO 026 no HttpServletRequest, use @RequestParam
        model.addAttribute("name", nameOfStudent.toUpperCase());
        return "processedPage";
    }
}

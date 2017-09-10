package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "processedPage";
    }

    @RequestMapping("/processFormToUpperCase")
    public String processForm(HttpServletRequest request, Model model) {
        System.out.println("T.his is in process: " +request.getParameter("studentName"));
        //TODO 025 instead of name, anything can be placed, but use this string in jsp while retrieving
        model.addAttribute("name", request.getParameter("studentName").toUpperCase());
        return "processedPage";
    }
}

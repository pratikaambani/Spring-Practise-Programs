package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
// TODO 023.B: @Controller
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        // TODO 023.B: only view-name, neither prefix, nor suffix
        return "main-menu";
    }

}

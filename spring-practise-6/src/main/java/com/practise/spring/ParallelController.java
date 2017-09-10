package com.practise.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pratik Ambani on 10/09/2017.
 */
@Controller
//TODO 027: @RequestMapping to controller
@RequestMapping("anotherMappingController")
public class ParallelController {

    @RequestMapping("/mappingOnController/showForm")
    public String displayForm() {
        return "parallel";
    }
}

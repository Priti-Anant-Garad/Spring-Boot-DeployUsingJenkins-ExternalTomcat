package com.deployment.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jenkinscontroller {

    @GetMapping("/")
    public String home()
    {
        return "index";
    }
    
}

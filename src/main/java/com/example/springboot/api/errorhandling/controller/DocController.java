package com.example.springboot.api.errorhandling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocController {

    @RequestMapping(value = "/api/v2")
    public String apis() {
        return "redirect:/swagger-ui.html";
    }

}

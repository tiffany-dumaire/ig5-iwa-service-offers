package com.ig5.project.iwa.services.offers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RootController {

    @GetMapping("/")
    public String rootRedirect() {
        return "redirect:swagger-ui.html";
    }

}
package com.aplication.primeraapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/userForm")
    public String getUserForm() {
        return "user-form";
    }
    
}

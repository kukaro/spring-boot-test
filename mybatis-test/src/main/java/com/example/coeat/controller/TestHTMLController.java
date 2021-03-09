package com.example.coeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestHTMLController {
    @RequestMapping(value = "/test")
    public String index(){
        return "test.html";
    }
}

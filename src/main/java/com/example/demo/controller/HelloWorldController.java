package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cont")
public class HelloWorldController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}

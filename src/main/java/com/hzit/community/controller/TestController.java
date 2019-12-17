package com.hzit.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/test")
    public String tt(){
        System.out.println("-------------------------------");
        return "index";
    }
}

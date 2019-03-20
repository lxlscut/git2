package com.example.git2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    @RequestMapping("a")
    @ResponseBody
    public String test(){

        return "success";
    }

}

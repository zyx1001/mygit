package com.zyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForeController {
    @RequestMapping("err")
    public String err(){
        System.out.println("controoler");
        return "err";
    }
}

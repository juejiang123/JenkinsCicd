package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

    @RequestMapping("/test")
    @ResponseBody
    public String requestQuery() {
        System.out.println("你好");
        return "nihao";
    }
}

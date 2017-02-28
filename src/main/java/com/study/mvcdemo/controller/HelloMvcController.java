package com.study.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paddy on 2017-2-26.
 */
@Controller
@RequestMapping("/")
public class HelloMvcController {
    
    @RequestMapping("/")
    public String helloMvc(){
        return "home";
    }
}

package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by paddy on 2017-2-26.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    
    @RequestMapping("/index")
    public String helloMvc(){
        return "home";
    }
}

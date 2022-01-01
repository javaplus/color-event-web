package com.barry.buttonweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public ModelAndView index(){
        System.out.println("Routing to start");
        return new ModelAndView("start");
    }
}
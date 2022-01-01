package com.barry.buttonweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("start");
        mv.addObject("red", 200);
        mv.addObject("green", 0);
        mv.addObject("blue", 255);
        return mv;
    }
}
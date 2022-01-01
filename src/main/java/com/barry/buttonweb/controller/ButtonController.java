package com.barry.buttonweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ButtonController {
    

    @GetMapping("/button")
    public ModelAndView getButton(int red, int green, int blue){
        String color = red + "," + green + "," + blue;
        System.out.println("Button color=" + color);
        return new ModelAndView("buttonSent");
    }




}
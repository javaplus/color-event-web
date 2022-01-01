package com.barry.buttonweb.controller;

import com.barry.buttonweb.services.ColorEventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ButtonController {
    
    @Autowired
    private ColorEventService colorEventService;

    @GetMapping("/button")
    public ModelAndView getButton(int red, int green, int blue){
        String color = red + "," + green + "," + blue;
        System.out.println("Button color=" + color);

        colorEventService.sendMessage(color);
        
        return new ModelAndView("buttonSent");
    }




}
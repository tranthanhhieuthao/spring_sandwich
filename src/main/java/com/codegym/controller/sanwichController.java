package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sanwichController {


    @GetMapping("")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("list")
    public String finish(@RequestParam String condiment,Model model){
        model.addAttribute("input",condiment);
        return "finish";
    }
}

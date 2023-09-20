package com.anasajimuhammed.ecommercebackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {
    @GetMapping("home")
    public String getHome(){
//        System.out.println("getHome callled   ////// ");
        return "Hii public";
    }
}

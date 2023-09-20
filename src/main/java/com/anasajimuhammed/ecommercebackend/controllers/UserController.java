package com.anasajimuhammed.ecommercebackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/")
public class UserController {
    @GetMapping("home")
    public String getUserHome(){
        return "Hii user";
    }
}

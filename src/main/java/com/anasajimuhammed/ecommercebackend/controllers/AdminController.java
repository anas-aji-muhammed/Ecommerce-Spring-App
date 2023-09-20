package com.anasajimuhammed.ecommercebackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/")
public class AdminController {

    @GetMapping("home")
    public String getAdminHome(){
        return "Hii admin";
    }
}

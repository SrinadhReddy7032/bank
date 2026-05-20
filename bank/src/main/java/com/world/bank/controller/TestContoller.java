package com.world.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Jenkins";
    }

    @GetMapping("/getCustomer")
    public String getCustomer() {
        return "Hello Srinadh Reddy";
    }
}

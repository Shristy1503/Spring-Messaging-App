package com.bridgelabz.messagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    //method to return hello
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name){
        return "Hello " + name + " from BridgeLabz";
    }
    //in method pass name as path variable
    @GetMapping("/hello/param/{name}")
    public String display(@PathVariable("name") String name){
        return "Hello " + name;
    }
}

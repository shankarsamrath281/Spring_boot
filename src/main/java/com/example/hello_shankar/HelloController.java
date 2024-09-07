package com.example.hello_shankar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/hello")
public class HelloController {

    // @PostMapping
    // public String postMethodName(@RequestBody String entity) {
    //     //TODO: process POST request
        
    //     return entity;
    // }

    @GetMapping("/Get")
    public String getMethodName() {
        return "Hello world";
    }
    
    
    // public String Hello(){
    //    System.out.println("Hello Geek welcome !!");
    //    return "Hello From Spring boot";
    // }
}

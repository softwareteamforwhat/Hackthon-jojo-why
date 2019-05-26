package com.example.hackathon.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String test(){
        return "Hello world!";
    }

}

package com.in28minutes.rest.webservices.webservices;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    // URI - /helloWorld
    //method - helloWorld
    @GetMapping(path = "/Hello-World") //localhost:8080/Hello-World
    public String HelloWorld() {
        return "Hello World \n" +
                "Spring boot";
    }



    @GetMapping(path = "/Hello-World-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World");

    }
}
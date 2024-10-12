package com.docker.docker.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/dummy")
public class DemoController {

    @GetMapping("/reflect/{name}")
    public String reflect(@PathVariable String name){

        return "welcome"+"-"+name;
    }

}

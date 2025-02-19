package com.neuefisch.demospring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloSomeone {

    @GetMapping("/hello/{name}")
    public String hiSb(@PathVariable String name){
        return "Hello, "+name;
    }
}

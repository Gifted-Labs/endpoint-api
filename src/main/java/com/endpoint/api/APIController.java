package com.endpoint.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("")
    public String printDetails(){
        return "He is a boy";
    }
}

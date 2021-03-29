package com.agnasarp.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "DEPARTMENT-SERVICE is not available or unresponsive. Please try again later.";
    }

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "USER-SERVICE is not available or unresponsive. Please try again later.";
    }
}


package com.example.project0507.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class wtController {
    
    @GetMapping("/wt")
    public @ResponseBody String wt() {
        return "Hello, wt!";
    }
    
}
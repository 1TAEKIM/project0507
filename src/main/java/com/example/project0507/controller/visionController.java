
package com.example.project0507.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class visionController {
    
    @GetMapping("/vision")
    public @ResponseBody String vision() {
        return "Hello, vision!";
    }
    
}
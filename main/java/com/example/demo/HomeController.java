package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.utils.Proxy;

@Controller
public class HomeController {
    @Autowired Proxy px;
    @GetMapping("/")
    public String index(){
        px.print("프록시 테스트");
        return "index";
    }

    
}

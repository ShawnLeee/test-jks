package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RequestMapping("/hello")
@RestController
public class HellowController {
    @RequestMapping(value = "/hh", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String hell(HttpServletRequest request, HttpServletResponse response){
        return "Hello world";
    }
}

package com.yjh.firstPJ.controller;

import com.yjh.firstPJ.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class FirstController {
    @Autowired
    FirstService firstService;

    @RequestMapping(value = "/srv/{data}")
    public void getData(@PathVariable int data){
        firstService.getData(data);
    }


}

package com.yjh.firstPJ.controller;

import com.yjh.firstPJ.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FirstController {
    @Autowired
    FirstService firstService;

}

package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.ReportAsSingleViolation;

@Controller
public class IndexContrller {
    @RequestMapping
    public  String home()
    {
        return "index";
    }

}

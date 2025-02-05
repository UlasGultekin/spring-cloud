package com.microlimitservices.controller;

import com.microlimitservices.bean.Limits;
import com.microlimitservices.configration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
    return new Limits(configuration.getMin(),configuration.getMax());
    }

}

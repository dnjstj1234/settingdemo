package com.study.demo.controller;

import com.study.demo.model.DemoModel;
import com.study.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/getData")
    public ResponseEntity getDemoData() {
        List<DemoModel> result = demoService.getDemoData();
        return new ResponseEntity(result, HttpStatus.OK) ;
    }
}

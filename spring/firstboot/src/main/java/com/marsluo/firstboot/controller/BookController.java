package com.marsluo.firstboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BookController {
    @GetMapping("/")
    public String index(Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("tip", "Welcome use springboot");
        model.addAllAttributes(map);
        return "hello";
    }

    @GetMapping("/rest")
    @ResponseBody
    public ResponseEntity restIndex(){
        return new ResponseEntity("Welcome use SpringBoot", null, HttpStatus.OK);
    }
}

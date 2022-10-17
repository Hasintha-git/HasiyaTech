package com.hasiyatech.hasiyatechapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Category")
public class CategoryController {

    @GetMapping("/get")
    public String home() {
        return ("<h1>Home</h1>");
    }

    @GetMapping("/save")
    public String user() {
        return ("<h1>Save</h1>");
    }

    @GetMapping("/update")
    public String admin() {
        return ("<h1>Update</h1>");
    }
}

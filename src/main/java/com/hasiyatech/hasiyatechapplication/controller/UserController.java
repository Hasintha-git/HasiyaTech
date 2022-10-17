package com.hasiyatech.hasiyatechapplication.controller;

import com.hasiyatech.hasiyatechapplication.DTO.request.User;
import com.hasiyatech.hasiyatechapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/get")
    public String home() {
        User user = userService.findUser();
        System.out.println(user+"<<<<");
        return ("<h1>Home</h1>");
    }

    @PostMapping("/save")
    public String user() {
        return ("<h1>Save</h1>");
    }

    @PutMapping("/update")
    public String admin() {
        return ("<h1>Update</h1>");
    }
}

package com.practice.equipmentborrowingmanagement1.controller;

import com.practice.equipmentborrowingmanagement1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserController")
@RequestMapping({"/","/user"})
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("register")
    public String register(
            Model model
            ){




        return "register";
    }


    @PostMapping("/save")
    public String save(

    ){

        return "register";
    }


    @GetMapping("login")
    public String login(
            Model model
    ){


        return "login";
    }



    @GetMapping("login")
    public String doLogin(
            Model model
    ){


        return "login";
    }




}

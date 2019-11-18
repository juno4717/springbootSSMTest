package com.qf.springboot.springboottest.controller;

import com.qf.springboot.springboottest.entity.User;
import com.qf.springboot.springboottest.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class myController {
    @Autowired
    userService userService;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("调用了controller");
        return "123";
    }
    @RequestMapping("/getUser")
    public String getUser(Model model){
        List<User> list = userService.getList();
        System.out.println("调用到了user");
        model.addAttribute("userList",list);
        return "hello";
    }
}

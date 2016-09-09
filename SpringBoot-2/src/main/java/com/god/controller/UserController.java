package com.god.controller;

import com.god.entity.User;
import com.god.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Gensis on 2016/9/7.
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    private User user;

    @Autowired
    private UserRepository userRepository;

    @Value("${application.hello:Hello Angel}")
    private String hello;

    @RequestMapping("/hello")
    public String welcome(Map<String,Object> map) {
        map.put("hello", hello);
        System.out.println("=====================");
        return "1";
    }


    @RequestMapping("/")
    public String index(Model model) {
        // 加入一个属性，用来在模板中读取
        model.addAttribute("host", "Welcome into defraud");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        System.out.println("++++++++++++++++++jnru+++++++++++++++++++");
        return "sunshine";
    }


    @RequestMapping("/add")
    public void add() {
        userRepository.save(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

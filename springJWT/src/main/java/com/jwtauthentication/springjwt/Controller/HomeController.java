package com.jwtauthentication.springjwt.Controller;


import com.jwtauthentication.springjwt.Model.User;
import com.jwtauthentication.springjwt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

//    http://localhost:8081/home/user

    @GetMapping("/user")
    public List<User> getUser(){
       return userService.getUser();
    }

    @GetMapping("/currentuser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}

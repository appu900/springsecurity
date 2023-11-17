package com.ss.springsecuritytwo.Controller;


import com.ss.springsecuritytwo.Event.RegistrationCompleteEvent;
import com.ss.springsecuritytwo.Model.UserModel;
import com.ss.springsecuritytwo.Service.UserService;
import com.ss.springsecuritytwo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user,"url"
        ));
        return "Sucesssfully Registered";
    }
}

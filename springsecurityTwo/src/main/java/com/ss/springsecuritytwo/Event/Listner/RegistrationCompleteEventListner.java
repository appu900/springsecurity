package com.ss.springsecuritytwo.Event.Listner;

import com.ss.springsecuritytwo.Event.RegistrationCompleteEvent;
import com.ss.springsecuritytwo.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationListener;

import java.util.UUID;


public class RegistrationCompleteEventListner implements ApplicationListener<RegistrationCompleteEvent>{

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
//        create varification token for user with link
//        and when the link is created
//        send the link to the user email

        User user = event.getUser();
        String token = UUID.randomUUID().toString();



    }
}

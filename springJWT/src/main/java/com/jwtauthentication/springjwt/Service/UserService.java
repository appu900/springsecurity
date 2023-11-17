package com.jwtauthentication.springjwt.Service;


import com.jwtauthentication.springjwt.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();
    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"appu","appu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"pabitra","pabitra@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }
}



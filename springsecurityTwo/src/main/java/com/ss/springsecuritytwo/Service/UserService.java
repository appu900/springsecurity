package com.ss.springsecuritytwo.Service;

import com.ss.springsecuritytwo.Model.UserModel;
import com.ss.springsecuritytwo.entity.User;

public interface UserService {

    User registerUser(UserModel userModel);
}

package com.ss.springsecuritytwo.Service;


import com.ss.springsecuritytwo.Model.UserModel;
import com.ss.springsecuritytwo.Repository.UserRepository;
import com.ss.springsecuritytwo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp  implements UserService{

    @Autowired
    private UserRepository userRepository;
   @Autowired
   private PasswordEncoder passwordEncoder;


    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        user.setRole("USER");
        return userRepository.save(user);

    }
}

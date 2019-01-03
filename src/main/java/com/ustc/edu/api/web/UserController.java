package com.ustc.edu.api.web;

import com.ustc.edu.api.model.IUserRepository;
import com.ustc.edu.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private IUserRepository UserRepository;

    @GetMapping(value = "/user")
    public List<User> getAllUserInfo(){
        return UserRepository.findAll();
    }

    @PostMapping(value = "/save")
    public User saveOne(
            @RequestParam("password") String password,
            @RequestParam("email") String email,
            @RequestParam("phone") String phone,
            @RequestParam("name") String name){

        User User = new User();
        User.setUserName(name);
        User.setPhone(phone);
        User.setPassword(password);
        User.setUserEmail(email);

        return UserRepository.save(User);

    }
    
}

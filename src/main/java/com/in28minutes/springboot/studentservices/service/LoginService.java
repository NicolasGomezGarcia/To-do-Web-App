package com.in28minutes.springboot.studentservices.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password) {
        // user1, password1
        return userid.equalsIgnoreCase("user1")
                && password.equalsIgnoreCase("password1");
    }

}

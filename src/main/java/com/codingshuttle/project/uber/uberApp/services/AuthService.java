package com.codingshuttle.project.uber.uberApp.services;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.SignupDTO;
import com.codingshuttle.project.uber.uberApp.dto.UserDTO;

public interface AuthService {
    String login(String email, String password);
    UserDTO signup(SignupDTO signupDTO);
    DriverDTO onboardNewDriver(Long userId);
}

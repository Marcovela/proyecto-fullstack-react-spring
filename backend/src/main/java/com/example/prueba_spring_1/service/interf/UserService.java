package com.example.prueba_spring_1.service.interf;

import com.example.prueba_spring_1.dto.LoginRequest;
import com.example.prueba_spring_1.dto.Response;
import com.example.prueba_spring_1.dto.UserDto;
import com.example.prueba_spring_1.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getLoginUser();

    Response getUserInfoAndOrderHistory();
}

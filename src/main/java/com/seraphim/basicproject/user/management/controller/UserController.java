package com.seraphim.basicproject.user.management.controller;

import com.seraphim.basicproject.user.management.dto.UserDto;
import com.seraphim.basicproject.user.management.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    UserService userService;

    @GetMapping("users")
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }
}

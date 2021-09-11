package com.seraphim.basicproject.user.management.service;

import com.seraphim.basicproject.user.management.dto.UserDto;
import com.seraphim.basicproject.user.management.mapper.UserMapper;
import com.seraphim.basicproject.user.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    public UserRepository userRepository;
    public UserMapper userMapper;

    public List<UserDto> getUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::map)
                .collect(Collectors.toList());
    }
}

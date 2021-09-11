package com.seraphim.basicproject.user.management.mapper;

import com.seraphim.basicproject.user.management.dto.RoleDto;
import com.seraphim.basicproject.user.management.dto.UserDto;
import com.seraphim.basicproject.user.management.model.Role;
import com.seraphim.basicproject.user.management.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMapper {

    RoleMapper roleMapper;

    public UserDto map(User user) {
        return UserDto.builder()
                .uuid(user.getUuid())
                .username(user.getUsername())
                .type(user.getType())
                .created(user.getCreated())
                .edited(user.getEdited())
                .active(user.getActive())
                .deactivated(user.getDeactivated())
                .roles(mapRoles(user.getRoles()))
                .build();
    }

    private List<RoleDto> mapRoles(List<Role> roles) {
        return roles.stream()
                .map(roleMapper::map)
                .collect(Collectors.toList());
    }
}

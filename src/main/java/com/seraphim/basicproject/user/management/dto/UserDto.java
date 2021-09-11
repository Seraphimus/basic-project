package com.seraphim.basicproject.user.management.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

@Value
@Builder
public class UserDto {
    String uuid;
    String username;
    String type;
    String password;
    LocalDateTime created;
    LocalDateTime edited;
    Boolean active;
    LocalDateTime deactivated;
    List<RoleDto> roles;
}

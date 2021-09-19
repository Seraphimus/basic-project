package com.seraphim.basicproject.user.management.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    String password;
    LocalDateTime created;
    LocalDateTime edited;
    Boolean active;
    LocalDateTime deactivated;
    List<RoleDto> roles;
}

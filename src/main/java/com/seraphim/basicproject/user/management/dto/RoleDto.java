package com.seraphim.basicproject.user.management.dto;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class RoleDto {

    String uuid;
    String name;
    String description;
    List<PermissionDto> permissions;
}

package com.seraphim.basicproject.user.management.mapper;

import com.seraphim.basicproject.user.management.dto.PermissionDto;
import com.seraphim.basicproject.user.management.dto.RoleDto;
import com.seraphim.basicproject.user.management.model.Permission;
import com.seraphim.basicproject.user.management.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleMapper {

    PermissionMapper permissionMapper;

    public RoleDto map(Role role) {
        return RoleDto.builder()
                .uuid(role.getUuid())
                .name(role.getName())
                .description(role.getDescription())
                .permissions(mapPermissions(role.getPermissions()))
                .build();
    }

    private List<PermissionDto> mapPermissions(List<Permission> permissions) {
        return permissions.stream()
                .map(permissionMapper::map)
                .collect(Collectors.toList());
    }
}

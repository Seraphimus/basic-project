package com.seraphim.basicproject.user.management.mapper;

import com.seraphim.basicproject.user.management.dto.PermissionDto;
import com.seraphim.basicproject.user.management.model.Permission;
import org.springframework.stereotype.Service;

@Service
public class PermissionMapper {

    public PermissionDto map(Permission permission) {
        return PermissionDto.builder()
                .codename(permission.getCodename())
                .description(permission.getDescription())
                .build();
    }
}

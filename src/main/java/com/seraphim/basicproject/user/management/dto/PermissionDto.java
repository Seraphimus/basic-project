package com.seraphim.basicproject.user.management.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PermissionDto {
    String codename;
    String description;
}

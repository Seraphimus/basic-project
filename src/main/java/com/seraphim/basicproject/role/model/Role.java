package com.seraphim.basicproject.role.model;

import com.seraphim.basicproject.permission.model.Permission;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Value
@Entity
public class Role {

    @Id
    String uuid;
    String name;
    String description;
    @ManyToMany
    List<Permission> permissions;
}

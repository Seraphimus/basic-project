package com.seraphim.basicproject.user.management.model;

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

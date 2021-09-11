package com.seraphim.basicproject.user.management.model;

import com.sun.istack.NotNull;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

@Value
@Entity
public class User {
    @Id
    String uuid;
    @NotNull
    String username;
    String type;
    String password;
    LocalDateTime created;
    LocalDateTime edited;
    Boolean active;
    LocalDateTime deactivated;
    @ManyToMany
    List<Role> roles;
}

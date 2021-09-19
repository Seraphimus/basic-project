package com.seraphim.basicproject.user.management.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
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
    @JoinTable(name = "userrole",
            joinColumns = {@JoinColumn(name = "useruuid")},
            inverseJoinColumns = {@JoinColumn(name = "roleuuid")}
    )
    List<Role> roles;
}

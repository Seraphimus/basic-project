package com.seraphim.basicproject.user.management.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
public class Role {

    @Id
    String uuid;
    String name;
    String description;

    @ManyToMany
    @JoinTable(name = "rolepermission",
            joinColumns = {@JoinColumn(name = "roleuuid")},
            inverseJoinColumns = {@JoinColumn(name = "permissioncodename")}
    )
    List<Permission> permissions;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "userrole",
            joinColumns = {@JoinColumn(name = "roleuuid")},
            inverseJoinColumns = {@JoinColumn(name = "useruuid")}
    )
    List<User> users;
}

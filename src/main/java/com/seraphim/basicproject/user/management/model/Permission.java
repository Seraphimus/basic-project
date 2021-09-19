package com.seraphim.basicproject.user.management.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Permission {
    @Id
    String codename;
    String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "rolepermission",
            joinColumns = {@JoinColumn(name = "permissioncodename")},
            inverseJoinColumns = {@JoinColumn(name = "roleuuid")}
    )
    List<Role> roles;
}

package com.seraphim.basicproject.user.management.model;

import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Value
@Entity
public class Permission {
    @Id
    String codename;
    String description;
}

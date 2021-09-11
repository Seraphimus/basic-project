package com.seraphim.basicproject.permission.model;

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

package com.seraphim.basicproject.user.management.repository;

import com.seraphim.basicproject.user.management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}

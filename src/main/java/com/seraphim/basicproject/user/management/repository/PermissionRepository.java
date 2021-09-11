package com.seraphim.basicproject.user.management.repository;

import com.seraphim.basicproject.user.management.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
}

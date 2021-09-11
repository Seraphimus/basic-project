package com.seraphim.basicproject.user.management.repository;

import com.seraphim.basicproject.user.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}

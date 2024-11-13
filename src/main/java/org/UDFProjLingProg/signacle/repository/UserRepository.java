package org.UDFProjLingProg.signacle.repository;

import java.util.List;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, UUID> {
    @Query("SELECT u FROM User u")
    List<User> findAll();
}

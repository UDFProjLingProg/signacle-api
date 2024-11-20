package org.UDFProjLingProg.signacle.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.id = :idUser")
    Optional<User> findByEmailAndId(@Param("email") final String email, @Param("idUser") final String idUser);

}

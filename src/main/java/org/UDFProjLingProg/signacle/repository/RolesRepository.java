package org.UDFProjLingProg.signacle.repository;

import java.util.Optional;
import org.UDFProjLingProg.signacle.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(String role);
}

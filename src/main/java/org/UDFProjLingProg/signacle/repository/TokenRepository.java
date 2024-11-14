package org.UDFProjLingProg.signacle.repository;

import java.util.Optional;
import org.UDFProjLingProg.signacle.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByToken(String token);
}

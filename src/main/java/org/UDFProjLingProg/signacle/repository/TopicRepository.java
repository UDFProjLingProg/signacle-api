package org.UDFProjLingProg.signacle.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, UUID> {
    Optional<Topic> findByWord(String word);

}

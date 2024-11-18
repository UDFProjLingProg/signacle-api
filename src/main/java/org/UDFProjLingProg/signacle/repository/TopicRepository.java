package org.UDFProjLingProg.signacle.repository;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, UUID> {
    Optional<Topic> findByWord(String word);
=======
import org.UDFProjLingProg.signacle.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TopicRepository extends JpaRepository<Topic, UUID> {
  Optional<Topic> findByWord(String word);
>>>>>>> main
}

package org.UDFProjLingProg.signacle.repository;

import org.UDFProjLingProg.signacle.entities.Libra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LibraRepository extends JpaRepository<Libra, UUID> {

  @Query("SELECT l FROM Libra l WHERE l.topic.id = :topicId")
  List<Libra> findByTopicId(@Param("topicId") UUID topicId);

}

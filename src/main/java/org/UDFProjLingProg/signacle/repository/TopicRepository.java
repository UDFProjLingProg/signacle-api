package org.UDFProjLingProg.signacle.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, UUID> {
  Optional<Topic> findByWord(String word);

  @Query("SELECT t FROM Topic t WHERE t.course.id = :courseId")
  List<Topic> findByCourseId(@Param("courseId") UUID courseId);
}

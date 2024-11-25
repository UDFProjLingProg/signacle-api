package org.UDFProjLingProg.signacle.repository;

import java.util.Optional;
import java.util.UUID;

import org.UDFProjLingProg.signacle.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {

    Optional<Course> findByName(String name);

}
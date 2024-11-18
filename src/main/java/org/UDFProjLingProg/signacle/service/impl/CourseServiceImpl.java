package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Course;
import org.UDFProjLingProg.signacle.mapper.CourseMapper;
import org.UDFProjLingProg.signacle.repository.CourseRepository;
import org.UDFProjLingProg.signacle.service.ICourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CourseServiceImpl extends GenericServiceImpl<Course, CourseDto> implements ICourseService {

    private final CourseRepository repository;
    private final CourseMapper mapper;

    public CourseServiceImpl(CourseRepository repository, CourseMapper mapper) {
        super(repository,mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CourseDto> findAll() {
        return this.mapper.toDto(this.repository.findAll());
    }

    public CourseDto findById(UUID id)
    {
        return this.mapper.toDto
            (this.repository.findById(id).orElseThrow(
                    () -> new RuntimeException("Course not found")
            ));
    }


    public CourseDto findByName(String name) {
        return this.mapper.toDto
                (this.repository.findByName(name).orElseThrow(
                        () -> new RuntimeException("Course not found")
                ));
    }

    public CourseDto create(CourseDto dto) {
        return  this.mapper.toDto(
                this.repository.save(this.mapper.toEntity(dto))
        );
    }

    public CourseDto update(UUID id, CourseDto dto) {
        Optional<Course> course = this.repository.findById(id);
        if(course.isPresent()) {
            Course courseEntity = course.get();

            courseEntity.setName(dto.getName());
            courseEntity.setUrlImage(dto.getUrlImage());
            courseEntity.setUrlVideo(dto.getUrlVideo());

            return this.mapper.toDto(
                    this.repository.save(courseEntity)
            );

        }
        return null;
    }

    public void delete(UUID id) {
        this.repository.deleteById(id);
    }
}

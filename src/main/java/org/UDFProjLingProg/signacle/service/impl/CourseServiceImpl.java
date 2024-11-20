package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Course;
import org.UDFProjLingProg.signacle.mapper.CourseMapper;
import org.UDFProjLingProg.signacle.repository.CourseRepository;
import org.UDFProjLingProg.signacle.service.ICourseService;
import org.UDFProjLingProg.signacle.service.ILibraService;
import org.UDFProjLingProg.signacle.service.ITopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl extends GenericServiceImpl<Course, CourseDto> implements ICourseService {

  private final CourseRepository repository;
  private final CourseMapper mapper;
  private final ITopicService topicService;
  private final ILibraService libraService;

  public CourseServiceImpl(CourseRepository repository, CourseMapper mapper, final ITopicService topicService, final ILibraService libraService) {
    super(repository, mapper);
    this.repository = repository;
    this.mapper = mapper;
    this.topicService = topicService;
    this.libraService = libraService;
  }

  @Override
  public List<CourseDto> findAll() {
    return this.mapper.toDto(this.repository.findAll());
  }

  public CourseDto findById(UUID id) {
    return this.mapper.toDto
            (this.repository.findById(id).orElseThrow(
                    () -> new RuntimeException("Course not found")
            ));
  }

  @Override
  public CourseDto findByName(String name) {
    return this.mapper.toDto
            (this.repository.findByName(name).orElseThrow(
                    () -> new RuntimeException("Course not found")
            ));
  }

  @Override
  public List<CourseDto> findAllComplete() throws Exception {
    List<CourseDto> listCourse = this.mapper.toDto(this.repository.findAll());
    for (final CourseDto dto : listCourse) {
      List<TopicDto> topicList = this.topicService.findByCourseId(dto.getId().toString());
      for (final TopicDto topicDto : topicList) {
        topicDto.setLibra(this.libraService.findByTopicId(topicDto.getId().toString()));
      }
      dto.setTopic(topicList);
    }
    return listCourse;
  }
}

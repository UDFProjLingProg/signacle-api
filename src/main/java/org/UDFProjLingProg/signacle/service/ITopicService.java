package org.UDFProjLingProg.signacle.service;

import java.util.List;
import java.util.UUID;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

public interface ITopicService extends GenericService<TopicDto> {

  @Override
  TopicDto save(TopicDto dto) throws Exception;

  @Override
  void delete(UUID id) throws Exception;

  List<TopicDto> findByCourseId(String courseId) throws Exception;

}

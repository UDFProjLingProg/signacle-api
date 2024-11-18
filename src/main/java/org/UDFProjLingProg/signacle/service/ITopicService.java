package org.UDFProjLingProg.signacle.service;
import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

import java.util.List;

public interface ITopicService extends GenericService<TopicDto>{

  @Override
  TopicDto save(TopicDto dto) throws Exception;

  List<TopicDto> findByCourseId(String courseId) throws Exception;

}

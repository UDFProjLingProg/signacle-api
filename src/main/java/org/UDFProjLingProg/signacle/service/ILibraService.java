package org.UDFProjLingProg.signacle.service;

import org.UDFProjLingProg.signacle.DTO.LibraDto;
import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

import java.util.List;

public interface ILibraService extends GenericService<LibraDto> {

  @Override
  LibraDto save(LibraDto dto) throws Exception;

  List<LibraDto> findByTopicId(String courseId) throws Exception;

}

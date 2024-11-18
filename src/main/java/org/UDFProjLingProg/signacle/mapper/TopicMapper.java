package org.UDFProjLingProg.signacle.mapper;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericEntityMapper;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TopicMapper extends GenericEntityMapper<TopicDto, Topic> {


  @Mapping(target = "id", source = "id")
  @Override
  Topic toEntity(TopicDto dto);

  @Mapping(target = "id", source = "id")
  @Mapping(target = "idCourse", source = "course.id")
  @Override
  TopicDto toDto(Topic entity);

  @Override
  List<Topic> toEntity(List<TopicDto> dtoList);

  @Override
  List<TopicDto> toDto(List<Topic> entityList);

}

package org.UDFProjLingProg.signacle.mapper;

import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericEntityMapper;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TopicMapper extends GenericEntityMapper<TopicDto, Topic> {
}

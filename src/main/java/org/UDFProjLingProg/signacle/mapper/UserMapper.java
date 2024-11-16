package org.UDFProjLingProg.signacle.mapper;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericEntityMapper;
import org.UDFProjLingProg.signacle.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericEntityMapper<UserDto, User> {

  @Override
  @Mapping(source = "id", target = "id")
  UserDto toDto(User entity);

}

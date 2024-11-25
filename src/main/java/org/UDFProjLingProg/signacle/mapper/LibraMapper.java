package org.UDFProjLingProg.signacle.mapper;

import org.UDFProjLingProg.signacle.DTO.LibraDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericEntityMapper;
import org.UDFProjLingProg.signacle.entities.Libra;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LibraMapper extends GenericEntityMapper<LibraDto, Libra> {
}

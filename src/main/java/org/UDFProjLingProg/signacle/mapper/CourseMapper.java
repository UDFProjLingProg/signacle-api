package org.UDFProjLingProg.signacle.mapper;

import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericEntityMapper;
import org.UDFProjLingProg.signacle.entities.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper extends GenericEntityMapper<CourseDto, Course> {
}

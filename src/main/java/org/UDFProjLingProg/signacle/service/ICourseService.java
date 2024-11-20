package org.UDFProjLingProg.signacle.service;

import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;
import org.UDFProjLingProg.signacle.entities.Course;

import java.util.List;

public interface ICourseService extends GenericService<CourseDto> {

  CourseDto findByName(String name);

  List<CourseDto> findAllComplete() throws Exception;

}

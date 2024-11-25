package org.UDFProjLingProg.signacle.service;

import java.util.List;

import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

public interface ICourseService extends GenericService<CourseDto> {

  CourseDto findByName(String name);

  List<CourseDto> findAllComplete() throws Exception;

}

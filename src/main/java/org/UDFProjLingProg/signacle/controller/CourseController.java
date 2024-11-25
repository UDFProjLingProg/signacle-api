package org.UDFProjLingProg.signacle.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.UDFProjLingProg.signacle.DTO.CourseDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericController;
import org.UDFProjLingProg.signacle.service.ICourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
@Tag(name = "Courses")
public class CourseController extends GenericController<CourseDto, CourseController> {

  private final ICourseService service;

  public CourseController(final ICourseService service) {
    super(service, "/course");
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<CourseDto>> getCourses() {
    return super.findAll();
  }

  @GetMapping("/all")
  public ResponseEntity<List<CourseDto>> getAllCourses() throws Exception {
    return ResponseEntity.ok().body(this.service.findAllComplete());
  }

  @GetMapping("/name")
  public ResponseEntity<CourseDto> getCourseByName(@RequestParam String name) {
    try {
      CourseDto course = service.findByName(name);
      return ResponseEntity.ok(course);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(null);
    }
  }

}

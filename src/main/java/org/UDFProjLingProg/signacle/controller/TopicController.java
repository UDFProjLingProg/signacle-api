package org.UDFProjLingProg.signacle.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.UDFProjLingProg.signacle.DTO.TopicDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericController;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;
import org.UDFProjLingProg.signacle.exceptions.BusinessException;
import org.UDFProjLingProg.signacle.service.ITopicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/topics")
@Tag(name = "Topics", description = "Listagem de Tópicos")
public class TopicController extends GenericController<TopicDto, TopicController> {

  private final ITopicService service;

  public TopicController(final GenericService<TopicDto> service, final ITopicService topicService) {
    super(service, "topics");
    this.service = topicService;
  }

  @GetMapping
  public ResponseEntity<List<TopicDto>> list() {
    return super.findAll();
  }

  @GetMapping("/id")
  public ResponseEntity<TopicDto> getTopicById(@RequestParam String id) {
    try {
      UUID uuid = UUID.fromString(id);
      TopicDto topic = service.findOneById(uuid).orElseThrow(() -> new BusinessException("Tópico não encontrado"));
      return ResponseEntity.ok(topic);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(null);
    }
  }

  @GetMapping("/course-id/{idCourse}")
  public ResponseEntity<List<TopicDto>> getCourseByID(@PathVariable final String idCourse) throws Exception {
    return ResponseEntity.ok().body(this.service.findByCourseId(idCourse));
  }

  @PostMapping
  public ResponseEntity<?> create(@RequestBody TopicDto dto) throws Exception {
    return super.createObject(dto);
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody TopicDto dto) throws Exception {
    return super.updateObject(dto);
  }

  @DeleteMapping
  public ResponseEntity<?> delete(@RequestBody String id) throws Exception {
    UUID uuid = UUID.fromString(id);
    return super.delete(uuid);
  }

}

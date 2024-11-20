package org.UDFProjLingProg.signacle.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.UDFProjLingProg.signacle.DTO.LibraDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericController;
import org.UDFProjLingProg.signacle.exceptions.BusinessException;
import org.UDFProjLingProg.signacle.service.ILibraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sign")
@Tag(name = "Signs", description = "Listagem de Sinais")
public class LibraController extends GenericController<LibraDto, LibraController> {

  private final ILibraService service;

  public LibraController(ILibraService service) {
    super(service, "/sign");
    this.service = service;
  }

  @GetMapping("/id")
  public ResponseEntity<LibraDto> getTopicById(@RequestParam String id) {
    try {
      UUID uuid = UUID.fromString(id);
      LibraDto libra = service.findOneById(uuid).orElseThrow(() -> new BusinessException("Tópico não encontrado"));
      return ResponseEntity.ok(libra);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(null);
    }
  }

  @GetMapping("/topic-id/{idTopic}")
  public ResponseEntity<List<LibraDto>> getCourseByID(@PathVariable final String idTopic) throws Exception {
    return ResponseEntity.ok().body(this.service.findByTopicId(idTopic));
  }

  @PostMapping
  public ResponseEntity<?> create(@RequestBody LibraDto dto) throws Exception {
    return super.createObject(dto);
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody LibraDto dto) throws Exception {
    return super.updateObject(dto);
  }

  @DeleteMapping
  public ResponseEntity<?> delete(@RequestBody String id) throws Exception {
    UUID uuid = UUID.fromString(id);
    return super.delete(uuid);
  }
}

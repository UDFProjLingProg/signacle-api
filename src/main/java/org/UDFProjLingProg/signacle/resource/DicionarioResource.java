package org.UDFProjLingProg.signacle.resource;

import org.UDFProjLingProg.signacle.DTO.LibraDto;
import org.UDFProjLingProg.signacle.resource.GenericResource;
import org.UDFProjLingProg.signacle.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/libra")
@Tag(name = "Libra", description = "Gerenciamento de Libras")
public class DicionarioResource extends GenericResource<LibraDto, DicionarioResource> {
      
    public DicionarioResource(final GenericService<LibraDto> service) {
        super(service, "api/libra");
    }
    
    @PostMapping
    public ResponseEntity<?> create(@RequestBody LibraDto libraDto) throws Exception {
        return super.createObject(libraDto);
    }
}

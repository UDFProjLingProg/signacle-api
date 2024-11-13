package org.UDFProjLingProg.signacle.controller;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericResource;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@Tag(name = "Users", description = "Listagem de Usuarios")
public class UsersController extends GenericResource<UserDto, UsersController> {
    public UsersController(final GenericService<UserDto> service){
        super(service, "api/users");
    }
    
    @GetMapping
    public ResponseEntity<List<UserDto>> list () {
        return super.findAll();
    }
}

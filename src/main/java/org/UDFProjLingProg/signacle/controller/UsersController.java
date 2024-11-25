package org.UDFProjLingProg.signacle.controller;

import java.util.List;
import java.util.UUID;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericController;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;
import org.UDFProjLingProg.signacle.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "Listagem de Usuarios")
public class UsersController extends GenericController<UserDto, UsersController> {
    private final IUserService userService;

    public UsersController(final GenericService<UserDto> service, IUserService userService){
        super(service, "users");
        this.userService = userService;
    }
    
    @GetMapping
    public ResponseEntity<List<UserDto>> list () {
        return super.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<UserDto> getUserByID(@RequestParam String id) {
        try {
            UUID uuid = UUID.fromString(id);
            UserDto user = userService.findUserId(uuid);
            return ResponseEntity.ok(user);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/public/email")
    public ResponseEntity<UserDto> getUserByEmail(@RequestParam String email) {
        try {
            UserDto user = userService.findUserByEmail(email);
            return ResponseEntity.ok(user);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<?> delete(@PathVariable("idUser") final String id) throws Exception {
        UUID uuid = UUID.fromString(id);
        return super.delete(uuid);
    }

}

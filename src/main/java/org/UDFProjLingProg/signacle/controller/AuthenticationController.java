package org.UDFProjLingProg.signacle.controller;

import org.UDFProjLingProg.signacle.DTO.AuthenticationRequest;
import org.UDFProjLingProg.signacle.DTO.AuthenticationResponse;
import org.UDFProjLingProg.signacle.DTO.RegistrationEmailRequest;
import org.UDFProjLingProg.signacle.DTO.RegistrationRequest;
import org.UDFProjLingProg.signacle.service.impl.AuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(
        @RequestBody @Valid RegistrationRequest request
    ) {
        service.register(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/register-user")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> registerOtherUser(
        @RequestBody @Valid RegistrationEmailRequest request
    ) throws Exception {
        service.registerOtherUser(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }

}

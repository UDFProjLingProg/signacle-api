package org.UDFProjLingProg.signacle.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.UDFProjLingProg.signacle.DTO.RegistrationRequest;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.repository.RolesRepository;
import org.UDFProjLingProg.signacle.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final RolesRepository rolesRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
//    private final EmailService emailService;

    public void register(RegistrationRequest request) {
        var userRole = rolesRepository.findByName("USER")
            .orElseThrow(() -> new IllegalStateException("ROLE USER was not initiated"));
        var user = User.builder()
            .firstName(request.getFirstName())
            .lastName(request.getLastName())
            .email(request.getEmail())
            .password(passwordEncoder.encode(request.getPassword()))
            .accountLocked(false)
            .enabled(false)
            .roles(List.of(userRole))
            .build();
        userRepository.save(user);
    }
}

package org.UDFProjLingProg.signacle.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.UDFProjLingProg.signacle.DTO.AuthenticationRequest;
import org.UDFProjLingProg.signacle.DTO.AuthenticationResponse;
import org.UDFProjLingProg.signacle.DTO.RegistrationEmailRequest;
import org.UDFProjLingProg.signacle.DTO.RegistrationRequest;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.repository.RolesRepository;
import org.UDFProjLingProg.signacle.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final RolesRepository rolesRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtServiceImpl jwtService;
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
            .enabled(true)
            .roles(List.of(userRole))
            .build();
        userRepository.save(user);
    }

    public void registerOtherUser(RegistrationEmailRequest request) {
        var userRole = rolesRepository.findByName("USER")
            .orElseThrow(() -> new IllegalStateException("ROLE USER was not initiated"));
        var user = User.builder()
            .email(request.getEmail())
            .accountLocked(false)
            .enabled(false)
            .roles(List.of(userRole))
            .build();
        userRepository.save(user);
    }

    public AuthenticationResponse authenticate(final AuthenticationRequest request) {
        Authentication auth = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getEmail(),
                request.getPassword()
            )
        );
        Map<String, Object> claims = new HashMap<String, Object>();
        User user = (User) auth.getPrincipal();
        claims.put("fullName", user.getFullName());
        String jwt = jwtService.generateToken(claims, user);
        return AuthenticationResponse.builder().token(jwt).build();
    }
}

package org.UDFProjLingProg.signacle.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Primeiro nome é obrigatório")
    @NotBlank(message = "Primeiro nome é obrigatório")
    private String firstName;
    @NotEmpty(message = "Último nome é obrigatório")
    @NotBlank(message = "Último nome é obrigatório")
    private String lastName;
    @Email(message = "Forneça um email válido")
    @NotEmpty(message = "Email é obrigatório")
    @NotBlank(message = "Email nome é obrigatório")
    private String email;
    @NotEmpty(message = "Senha nome é obrigatório")
    @NotBlank(message = "Senha nome é obrigatório")
    private String password;
}

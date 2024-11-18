package org.UDFProjLingProg.signacle.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationEmailRequest {

    @Email(message = "Forneça um email válido")
    @NotEmpty(message = "Email é obrigatório")
    @NotBlank(message = "Email nome é obrigatório")
    private String email;
}

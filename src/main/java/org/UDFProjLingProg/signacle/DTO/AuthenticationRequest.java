package org.UDFProjLingProg.signacle.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationRequest {

  @Email(message = "Forneça um email válido")
  @NotEmpty(message = "Email é obrigatório")
  @NotBlank(message = "Email é obrigatório")
  private String email;
  @NotEmpty(message = "Senha é obrigatório")
  @NotBlank(message = "Senha é obrigatório")
  private String password;

}

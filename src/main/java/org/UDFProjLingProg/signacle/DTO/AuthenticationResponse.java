package org.UDFProjLingProg.signacle.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponse {

  private String token;

}

package org.UDFProjLingProg.signacle.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExceptionsResponses {

  private Integer businessErrorCode;
  private String businessErrorDescription;
  private String error;
  private Set<String> validationErrors;
  private Map<String, String> errors;
}
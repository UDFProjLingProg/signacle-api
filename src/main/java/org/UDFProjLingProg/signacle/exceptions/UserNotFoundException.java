package org.UDFProjLingProg.signacle.exceptions;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String mensagem) {
    super(mensagem);
  }
}

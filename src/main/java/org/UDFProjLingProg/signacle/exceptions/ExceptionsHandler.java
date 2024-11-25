package org.UDFProjLingProg.signacle.exceptions;

import static org.UDFProjLingProg.signacle.exceptions.ExceptionsCodes.ACCOUNT_DISABLED;
import static org.UDFProjLingProg.signacle.exceptions.ExceptionsCodes.ACCOUNT_LOCKED;
import static org.UDFProjLingProg.signacle.exceptions.ExceptionsCodes.BAD_CREDENTIALS;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.UNAUTHORIZED;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.mail.MessagingException;

@RestControllerAdvice
public class ExceptionsHandler {
  @ExceptionHandler(LockedException.class)
  public ResponseEntity<ExceptionsResponses> handleException(LockedException exp) {
    return ResponseEntity
            .status(UNAUTHORIZED)
            .body(
                    ExceptionsResponses.builder()
                            .businessErrorCode(ACCOUNT_LOCKED.getCode())
                            .businessErrorDescription(ACCOUNT_LOCKED.getDescription())
                            .error(exp.getMessage())
                            .build()
            );
  }

  @ExceptionHandler(DisabledException.class)
  public ResponseEntity<ExceptionsResponses> handleException(DisabledException exp) {
    return ResponseEntity
            .status(UNAUTHORIZED)
            .body(
                    ExceptionsResponses.builder()
                            .businessErrorCode(ACCOUNT_DISABLED.getCode())
                            .businessErrorDescription(ACCOUNT_DISABLED.getDescription())
                            .error(exp.getMessage())
                            .build()
            );
  }


  @ExceptionHandler(BadCredentialsException.class)
  public ResponseEntity<ExceptionsResponses> handleException() {
    return ResponseEntity
            .status(UNAUTHORIZED)
            .body(
                    ExceptionsResponses.builder()
                            .businessErrorCode(BAD_CREDENTIALS.getCode())
                            .businessErrorDescription(BAD_CREDENTIALS.getDescription())
                            .error("Login and / or Password is incorrect")
                            .build()
            );
  }

  @ExceptionHandler(MessagingException.class)
  public ResponseEntity<ExceptionsResponses> handleException(MessagingException exp) {
    return ResponseEntity
            .status(INTERNAL_SERVER_ERROR)
            .body(
                    ExceptionsResponses.builder()
                            .error(exp.getMessage())
                            .build()
            );
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ExceptionsResponses> handleMethodArgumentNotValidException(MethodArgumentNotValidException exp) {
    Set<String> errors = new HashSet<>();
    exp.getBindingResult().getAllErrors()
            .forEach(error -> {
              var errorMessage = error.getDefaultMessage();
              errors.add(errorMessage);
            });

    return ResponseEntity
            .status(BAD_REQUEST)
            .body(
                    ExceptionsResponses.builder()
                            .validationErrors(errors)
                            .build()
            );
  }

  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<ExceptionsResponses> handleException(UserNotFoundException exp) {
    return ResponseEntity.status(NOT_FOUND)
            .body(
                    ExceptionsResponses.builder().error(exp.getMessage()).build()
            );
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ExceptionsResponses> handleException(Exception exp) {
    exp.printStackTrace();
    return ResponseEntity
            .status(INTERNAL_SERVER_ERROR)
            .body(
                    ExceptionsResponses.builder()
                            .businessErrorDescription("Internal error, please contact the admin")
                            .error(exp.getMessage())
                            .build()
            );
  }
}

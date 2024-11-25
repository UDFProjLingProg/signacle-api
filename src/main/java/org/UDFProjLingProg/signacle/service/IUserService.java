package org.UDFProjLingProg.signacle.service;

import java.util.UUID;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

public interface IUserService extends GenericService<UserDto> {
    UserDto findUserId(UUID id);

    UserDto findUserByEmail(String email);
}

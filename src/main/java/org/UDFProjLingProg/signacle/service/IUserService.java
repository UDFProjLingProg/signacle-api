package org.UDFProjLingProg.signacle.service;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericService;

import java.util.UUID;

public interface IUserService extends GenericService<UserDto> {
    UserDto findUserId(UUID id);
}

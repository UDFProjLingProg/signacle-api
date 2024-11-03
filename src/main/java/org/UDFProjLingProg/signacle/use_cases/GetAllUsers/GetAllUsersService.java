package org.UDFProjLingProg.signacle.use_cases.GetAllUsers;

import java.util.List;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.service.impl.GenericServiceImpl;
import org.UDFProjLingProg.signacle.use_cases.interfaces.IDicionarioService;

public class GetAllUsersService extends GenericServiceImpl<User, UserDto>  implements 
IDicionarioService{
    public GetAllEventsService() {
    }

    @Override
    public List<UserDto> findAll(){
        
    }
}

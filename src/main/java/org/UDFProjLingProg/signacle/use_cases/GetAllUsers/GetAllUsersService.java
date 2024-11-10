package org.UDFProjLingProg.signacle.use_cases.GetAllUsers;

import java.util.List;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.mapper.UserMapper;
import org.UDFProjLingProg.signacle.repository.UserRepository;
import org.UDFProjLingProg.signacle.use_cases.interfaces.IUserService;

import org.springframework.stereotype.Service;

@Service
public class GetAllUsersService extends GenericServiceImpl<User, UserDto>  implements 
IUserService{
    private final UserRepository repository;

    private final UserMapper mapper;

    public GetAllUsersService(final UserRepository repository,
        final UserMapper mapper) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> findAll(){
        return this.mapper.toDto(this.repository.findAll());
    }
}

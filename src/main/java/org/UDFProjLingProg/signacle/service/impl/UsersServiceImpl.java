package org.UDFProjLingProg.signacle.service.impl;

import java.util.List;
import java.util.UUID;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.mapper.UserMapper;
import org.UDFProjLingProg.signacle.repository.UserRepository;
import org.UDFProjLingProg.signacle.service.IUserService;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends GenericServiceImpl<User, UserDto>  implements
IUserService{
    private final UserRepository repository;

    private final UserMapper mapper;
    private final UserRepository userRepository;

    public UsersServiceImpl(final UserRepository repository,
                            final UserMapper mapper, UserRepository userRepository) {
        super(repository, mapper);
        this.repository = repository;
        this.mapper = mapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDto findUserId(UUID id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));
        UserDto userDto = UserDto.builder().email(user.getEmail()).name(user.getFullName()).build();
        userDto.setId(user.getId());
        return userDto;
    }

    @Override
    public List<UserDto> findAll(){
        return this.mapper.toDto(this.repository.findAll());
    }
}

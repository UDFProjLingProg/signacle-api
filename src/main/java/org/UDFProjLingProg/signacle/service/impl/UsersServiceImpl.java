package org.UDFProjLingProg.signacle.service.impl;

import java.util.List;
import java.util.UUID;

import org.UDFProjLingProg.signacle.DTO.UserDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.User;
import org.UDFProjLingProg.signacle.exceptions.UserNotFoundException;
import org.UDFProjLingProg.signacle.mapper.UserMapper;
import org.UDFProjLingProg.signacle.repository.UserRepository;
import org.UDFProjLingProg.signacle.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends GenericServiceImpl<User, UserDto> implements
        IUserService {
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
    User user = this.userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User was not found"));
    return UserDto.builder().id(user.getId()).email(user.getEmail()).fullName(user.getFullName()).build();
  }

  @Override
  public UserDto findUserByEmail(final String email) {
    return this.mapper.toDto(this.userRepository
            .findByEmail(email).orElseThrow(() -> new UserNotFoundException("User was not found")));
  }

  @Override
  public List<UserDto> findAll() {
    return this.mapper.toDto(this.repository.findAll());
  }
}

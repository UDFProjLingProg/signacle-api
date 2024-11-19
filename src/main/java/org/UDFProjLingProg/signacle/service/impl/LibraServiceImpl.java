package org.UDFProjLingProg.signacle.service.impl;

import org.UDFProjLingProg.signacle.DTO.LibraDto;
import org.UDFProjLingProg.signacle.Utils.Generics.GenericServiceImpl;
import org.UDFProjLingProg.signacle.entities.Libra;
import org.UDFProjLingProg.signacle.entities.Topic;
import org.UDFProjLingProg.signacle.exceptions.BusinessException;
import org.UDFProjLingProg.signacle.mapper.LibraMapper;
import org.UDFProjLingProg.signacle.repository.LibraRepository;
import org.UDFProjLingProg.signacle.repository.TopicRepository;
import org.UDFProjLingProg.signacle.service.ILibraService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class LibraServiceImpl extends GenericServiceImpl<Libra, LibraDto> implements ILibraService {

  private final LibraRepository repository;
  private final LibraMapper mapper;
  private final TopicRepository topicRepository;

  public LibraServiceImpl(final LibraRepository repository, final LibraMapper mapper, final TopicRepository topicRepository) {
    super(repository, mapper);
    this.repository = repository;
    this.mapper = mapper;
    this.topicRepository = topicRepository;
  }

  @Override
  public List<LibraDto> findAll() {
    return List.of();
  }

  @Override
  public LibraDto save(LibraDto dto) throws BusinessException {
    UUID idTopic = UUID.fromString(dto.getIdTopic());
    Topic topic = this.topicRepository.findById(idTopic).orElseThrow(() -> new BusinessException("O Tópico não foi encontrado"));
    Libra libra = this.mapper.toEntity(dto);
    libra.setTopic(topic);

    if (libra.getCreated() == null) {
      libra.setCreated(LocalDateTime.now());
    }
    return this.mapper.toDto(
            this.repository.save(libra)
    );
  }

  @Override
  public List<LibraDto> findByTopicId(final String topicId) throws Exception {
    UUID idTopic = UUID.fromString(topicId);
    return this.mapper.toDto(this.repository.findByTopicId(idTopic));
  }
}

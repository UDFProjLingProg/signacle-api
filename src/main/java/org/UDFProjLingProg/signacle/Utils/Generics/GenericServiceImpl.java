package org.UDFProjLingProg.signacle.Utils.Generics;


import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntity;
import org.UDFProjLingProg.signacle.Utils.Abstracts.AbstractEntityDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public abstract class GenericServiceImpl<E extends AbstractEntity, D extends AbstractEntityDTO> implements
        GenericService<D> {

  private final JpaRepository<E, UUID> repository;

  private final GenericEntityMapper<D, E> mapper;

  public GenericServiceImpl(
          JpaRepository<E, UUID> repository, GenericEntityMapper<D, E> mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  @Override
  public D save(D d) throws Exception {
    return this.executeSave(d);
  }

  @Override
  public Optional<D> findOneById(UUID id) {
    if (id == null) {
      return Optional.empty();
    }
    Optional<E> optional = this.repository.findById(id);
    if (optional.isPresent()) {
      return optional.map(this.mapper::toDto);
    }
    return Optional.empty();
  }

  @Override
  public void delete(UUID id) throws Exception {
    Optional<D> optional = this.findOneById(id);
    this.executeDelete(optional);
  }

  D executeSave(D d) throws Exception {
    E e = this.mapper.toEntity(d);
    if (d.getId() != null) {
      Optional<D> beforeOptional = this.findOneById(d.getId());
      if (beforeOptional.isEmpty()) {
        throw new Exception("The entity does not exist");
      }
    }
    if (e.getCreated() == null) {
      e.setCreated(LocalDateTime.now());
    }
    this.repository.save(e);
    return this.mapper.toDto(e);
  }

  void executeDelete(Optional<D> optional) throws Exception {
    if (optional.isPresent()) {
      Optional<E> e = this.repository.findById(optional.get().getId());
      e.ifPresent(this.repository::delete);
    }
  }


  abstract public List<D> findAll();

  @Override
  public List<D> diffBetweenBasedOnId(List<D> aList, List<D> bList) {
    if (bList == null) {
      return new ArrayList<>();
    }
    if (aList != null && aList.isEmpty()) {
      return bList;
    }
    if (aList == null) {
      return bList;
    }
    return aList.stream().filter(f -> isPresent(f, bList)).collect(Collectors.toList());
  }

  public Boolean isPresent(D candidate, List<D> comparationList) {
    if (candidate == null || comparationList == null || comparationList.isEmpty()
            || candidate.getId() == null) {
      return Boolean.FALSE;
    }
    for (D compared : comparationList) {
      if (candidate.getId().equals(compared.getId())) {
        return Boolean.TRUE;
      }
    }
    return Boolean.FALSE;
  }
}

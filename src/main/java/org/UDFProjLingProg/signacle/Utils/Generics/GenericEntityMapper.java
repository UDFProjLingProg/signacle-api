package org.UDFProjLingProg.signacle.Utils.Generics;

import java.util.List;

public interface GenericEntityMapper<D, E> {

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}

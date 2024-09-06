package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;

import java.util.List;

public interface ITypepersistencePort {
    Type save(Type type);
    List<Type> getAllTypes();
    Type getTypeById(Long id);
    void updateType(Type type);
    void deleteTypeById(Long id);

}

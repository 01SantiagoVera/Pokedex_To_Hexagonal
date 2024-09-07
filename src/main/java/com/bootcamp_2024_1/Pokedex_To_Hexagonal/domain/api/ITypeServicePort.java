package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;

import java.util.List;

public interface ITypeServicePort {

    Type saveType(Type type);
    List<Type> getAllType();
    Type getTypeById(long id);

    void updateType(Type type);
    void deleteTypeById(Long id);

}

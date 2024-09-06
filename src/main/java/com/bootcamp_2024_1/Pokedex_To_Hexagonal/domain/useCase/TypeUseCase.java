package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.useCase;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.ITypeServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi.ITypepersistencePort;

import java.util.List;

public class TypeUseCase implements ITypeServicePort {

    private final ITypepersistencePort typepersistencePort;

    public TypeUseCase(ITypepersistencePort typepersistencePort) {
        this.typepersistencePort = typepersistencePort;
    }

    @Override
    public Type save(Type type) {
        return typepersistencePort.save(type);
    }

    @Override
    public List<Type> getAllType() {
        return typepersistencePort.getAllTypes();
    }

    @Override
    public Type getTypeById(long id) {
        return typepersistencePort.getTypeById(id);
    }

    @Override
    public void updateType(Type type) {
        typepersistencePort.updateType(type);
    }

    @Override
    public void deleteTypeById(Long id) {
        typepersistencePort.deleteTypeById(id);
    }
}

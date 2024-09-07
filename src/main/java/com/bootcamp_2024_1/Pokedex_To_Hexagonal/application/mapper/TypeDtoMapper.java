package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.TypeDto;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = {TypeDtoMapper.class})



public interface TypeDtoMapper {
    TypeDto toDto(Type type);
}

package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexResponse;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.TypeDto;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Base64;
import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = {TypeDtoMapper.class})

public interface PokedexResponseMapper {
    TypeDtoMapper INSTANCE = Mappers.getMapper(TypeDtoMapper.class);


    @Mapping(target = "types.firstType", source = "firstType")
    @Mapping(target = "types.secondType", source = "secondType")
    @Mapping(target = "photo", qualifiedByName = "byteArrayToBase64")
    PokedexResponse toResponse(Pokemon pokemon, TypeDto typeDto, Photo photo);

    @Named("byteArrayToBase64")
    static String byteArrayToBase64(byte[] byteArrayPhoto) {
        return Base64.getEncoder().encodeToString(byteArrayPhoto);
    }

    default List<PokedexResponse> toResponseList(List<Pokemon> pokemonList, List<Type> typeList, List<Photo> photoList) {
        return pokemonList.stream()
                .map(pokemon -> {
                    PokedexResponse pokedexResponse = new PokedexResponse();
                    pokedexResponse.setNumber(pokemon.getNumber());
                    pokedexResponse.setName(pokemon.getName());
                    pokedexResponse.setType(INSTANCE.toDto(typeList.stream().filter(type -> type.getId().equals(pokemon.getTypeId())).findFirst().orElse(null)));
                    pokedexResponse.setPhoto(byteArrayToBase64(photoList.stream().filter(photo -> photo.getId().equals(pokemon.getPhotoId())).findFirst().orElse(null).getImage()));
                    return pokedexResponse;
                }).toList();
    }
}

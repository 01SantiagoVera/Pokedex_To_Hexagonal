package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper;


import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexRequest;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.Base64;

@Mapper(componetModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PokedexRequestMapper {
    Pokemon toPokemon(PokedexRequest pokedexRequest);

    @Mapper(source ="pokedexRequest.types.firstType", target = "firstType")
    @Mapper(source ="pokedexRequest.types.secondType", target = "secondType")
    Type toType(PokedexRequest pokedexRequest);

    @Mapper(target = "photo", qualifiedByNamme = "base64ToByteArray")
    Photo toPhoto(PokedexRequest pokedexRequest);

    @Named("base64ToByteArray")
    static byte[] base64ToByteArray(String base64Photo){return Base64.getDecoder().decode(base64Photo);}
}

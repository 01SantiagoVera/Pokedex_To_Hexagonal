package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.handler;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexRequest;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexResponse;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper.PokedexRequestMapper;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper.PokedexResponseMapper;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.mapper.TypeDtoMapper;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.IPhotoServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.IPokemonServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.ITypeServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional

public class PokedexHandler implements IPokedexHandler{

    private final IPokemonServicePort pokemonServicePort;
    private final ITypeServicePort typeServicePort;
    private final IPhotoServicePort photoServicePort;
    private final PokedexRequestMapper pokedexRequestMapper;
    private final PokedexResponseMapper pokedexResponseMapper;
    private final TypeDtoMapper typeDtoMapper;



    @Override
    public void savePokemonInPokedex(PokedexRequest pokedexRequest) {
        Type type = typeServicePort.saveType(pokedexRequestMapper.toType(pokedexRequest));
        Photo photo = photoServicePort.savePhoto(pokedexRequestMapper.toPhoto(pokedexRequest));
        Pokemon pokemon = pokedexRequestMapper.toPokemon(pokedexRequest);
        pokemon.setTypeId(type.getId());
        pokemon.setPhotoId(photo.getId());
        pokemonServicePort.savePokemon(pokemon);
    }

    @Override
    public List<PokedexRequest> getPokemonInPokedex() {
        return pokedexResponseMapper.toResponseList(pokemonServicePort.getAllPokemon(),typeServicePort.getAllType(),photoServicePort.getAllPhoto());
    }

    @Override
    public PokedexResponse getPokemonInPokedex(Long PokemonNumber) {
        Pokemon pokemon = pokemonServicePort.getPokemonById(PokemonNumber);
        return pokedexResponseMapper.toResponse(pokemon, typeDtoMapper.toDto(typeServicePort.getTypeById(pokemon.getTypeId())), photoServicePort.getPhoto(pokemon.getPhotoId()));
    }

    @Override
    public void updatePokemonInPokedex(PokedexRequest pokedexRequest) {
        Pokemon oldPokemon = pokemonServicePort.getPokemonById(pokedexRequest.getNumber());
        Type newType = pokedexRequestMapper.toType(pokedexRequest);
        newType.setId(oldPokemon.getTypeId());
        typeServicePort.updateType(newType);
        Photo newPhoto = photoServicePort.getPhoto(oldPokemon.getPhotoId());
        newPhoto.setId(oldPokemon.getPhotoId());
        photoServicePort.updatePhoto(newPhoto);
        Pokemon newPokemon = pokedexRequestMapper.toPokemon(pokedexRequest);
        newPokemon.setId(oldPokemon.getId());
        newPokemon.setTypeId(oldPokemon.getTypeId());
        newPokemon.setPhotoId(oldPokemon.getPhotoId());
        pokemonServicePort.updatePokemon(newPokemon);

    }

    @Override
    public void deletePokemonInPokedex(Long PokemonNumber) {
        Pokemon pokemon = pokemonServicePort.getPokemonById(PokemonNumber);
        typeServicePort.deleteTypeById(pokemon.getTypeId());
        photoServicePort.deletePhoto(pokemon.getPhotoId());
        pokemonServicePort.deletePokemon(PokemonNumber);

    }
}

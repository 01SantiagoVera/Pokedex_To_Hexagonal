package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.handler;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexRequest;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto.PokedexResponse;

import java.util.List;

public interface IPokedexHandler {
    void savePokemonInPokedex(PokedexRequest pokedexRequest);

    List<PokedexRequest> getPokemonInPokedex();
    PokedexResponse getPokemonInPokedex(Long PokemonNumber);

    void updatePokemonInPokedex(PokedexRequest pokedexRequest);
    void deletePokemonInPokedex(Long PokemonNumber);
}

package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;

import java.util.List;

public interface IPokemonServicePort {
    void savePokemon(Pokemon pokemon);

    List<Pokemon> getAllPokemon();

    Pokemon getPokemonById(long PokemonNumber);

    void updatePokemon(Pokemon pokemon);
    void deletePokemon(long PokemonNumber);
}

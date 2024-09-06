package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;

import java.util.List;

public interface IPokemonPersistencePort {
    void savePokemon(Pokemon pokemon);
    List<Pokemon> getPokemons();
    Pokemon getPokemon(long PokemonNumber);
    void updatePokemon(Pokemon pokemon);
    void deletePokemon(long PokemonNumber);
}

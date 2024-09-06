package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.useCase;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.IPokemonServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Pokemon;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi.IPokemonPersistencePort;

import java.util.List;

public class PokemonUseCase implements IPokemonServicePort {

    private final IPokemonPersistencePort pokemonPersistencePort;

    public PokemonUseCase(IPokemonPersistencePort pokemonPersistencePort) {
        this.pokemonPersistencePort = pokemonPersistencePort;
    }
    @Override
    public void addPokemon(Pokemon pokemon) {
        pokemonPersistencePort.savePokemon(pokemon);
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonPersistencePort.getPokemons();
    }

    @Override
    public Pokemon getPokemonById(long PokemonNumber) {
        return pokemonPersistencePort.getPokemon(PokemonNumber);
    }

    @Override
    public void updatePokemon(Pokemon pokemon) {
        pokemonPersistencePort.updatePokemon(pokemon);
    }

    @Override
    public void deletePokemon(long PokemonNumber) {
        pokemonPersistencePort.deletePokemon(PokemonNumber);
    }
}

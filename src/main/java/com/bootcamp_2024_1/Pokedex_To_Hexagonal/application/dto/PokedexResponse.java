package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokedexResponse {
    private long number;
    private String name;
    private TypeDto type;
    private String photo;
}

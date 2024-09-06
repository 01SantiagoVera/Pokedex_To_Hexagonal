package com.bootcamp_2024_1.Pokedex_To_Hexagonal.application.dto;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokedexRequest {
 private Long number;
 private String name;
 private Type type;
 private String photo;

}

package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model;

public class Type {

    private Long id;
    private String firstType;
    private String secondType;

    public Type(Long id, String firstType, String secondType) {
        this.id = id;
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

}

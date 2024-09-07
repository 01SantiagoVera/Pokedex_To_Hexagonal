package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model;

public class Pokemon {

    private Long id;
    private Long number;
    private String name;
    private Long TypeId;
    private String PhotoId;

    public Pokemon(Long id, Long number, String name, Long typeId, String photoId) {
        this.id = id;
        this.number = number;
        this.name = name;
        TypeId = typeId;
        PhotoId = photoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTypeId() {
        return TypeId;
    }

    public void setTypeId(Long typeId) {
        TypeId = typeId;
    }

    public String getPhotoId() {
        return PhotoId;
    }

    public void setPhotoId(String photoId) {
        PhotoId = photoId;
    }
}

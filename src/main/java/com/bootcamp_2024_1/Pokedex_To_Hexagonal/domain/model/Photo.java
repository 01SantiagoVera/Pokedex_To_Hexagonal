package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model;

public class Photo {

    private String id;
    private byte[] image;

    public Photo(String id, byte[] image) {
        this.id = id;
        this.image = image;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
}

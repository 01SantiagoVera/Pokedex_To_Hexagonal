package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model;

public class Photo {

    private int id;
    private byte[] image;

    public Photo(int id, byte[] image) {
        this.id = id;
        this.image = image;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
}

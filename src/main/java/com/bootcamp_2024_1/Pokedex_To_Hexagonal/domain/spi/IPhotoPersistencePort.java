package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;

import java.util.List;

public interface IPhotoPersistencePort {
    Photo save(Photo photo);
    List<Photo> getAllPhotos();
    Photo getPhoto(String id);
    void updatePhoto(Photo photo);
    void deletePhoto(String id);
}

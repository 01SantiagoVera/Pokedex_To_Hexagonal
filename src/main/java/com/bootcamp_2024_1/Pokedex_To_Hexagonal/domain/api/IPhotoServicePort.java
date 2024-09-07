package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;

import java.util.List;

public interface IPhotoServicePort {
    Photo savePhoto(Photo photo);
    List<Photo> getAllPhoto();
    Photo getPhoto(String id);
    void updatePhoto(Photo photo);
    void deletePhoto(String id);
}

package com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.useCase;

import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.api.IPhotoServicePort;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.model.Photo;
import com.bootcamp_2024_1.Pokedex_To_Hexagonal.domain.spi.IPhotoPersistencePort;

import java.util.List;

public class photoUseCase implements IPhotoServicePort {

    private final IPhotoPersistencePort photoPersistencePort;

    public photoUseCase(IPhotoPersistencePort photoPersistencePort) {
        this.photoPersistencePort = photoPersistencePort;
    }

    @Override
    public Photo savePhoto(Photo photo) {
        return photoPersistencePort.save(photo);
    }

    @Override
    public List<Photo> getAllPhoto() {
        return photoPersistencePort.getAllPhotos();
    }

    @Override
    public Photo getPhoto(String id) {
        return photoPersistencePort.getPhoto(id);
    }

    @Override
    public void updatePhoto(Photo photo) {
        photoPersistencePort.updatePhoto(photo);
    }

    @Override
    public void deletePhoto(String id) {
        photoPersistencePort.deletePhoto(id);
    }
}

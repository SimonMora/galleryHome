package com.accenture.springEurekaImage.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.springEurekaImage.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	public List<Image> findByGalleryId(Long galleryId);
	public Optional<Image> findById(Long id);
}

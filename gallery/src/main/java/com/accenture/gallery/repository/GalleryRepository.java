package com.accenture.gallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.gallery.entities.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}

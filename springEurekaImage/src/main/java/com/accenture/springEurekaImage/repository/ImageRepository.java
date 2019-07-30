package com.accenture.springEurekaImage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.springEurekaImage.entities.Images;

public interface ImageRepository extends JpaRepository<Images, Long> {

}

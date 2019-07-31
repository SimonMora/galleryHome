package com.accenture.springEurekaImage.service;

import java.util.List;

import com.accenture.springEurekaImage.entities.Images;

public interface ImageService {

	public List<Images> findAll();

	public Images save(Images image);
}

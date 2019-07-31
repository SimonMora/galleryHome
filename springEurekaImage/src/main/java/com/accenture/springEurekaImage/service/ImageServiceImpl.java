package com.accenture.springEurekaImage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.springEurekaImage.entities.Images;
import com.accenture.springEurekaImage.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepository repoImg;
	
	@Override
	@Transactional
	public List<Images> findAll() {

		return repoImg.findAll();
	}

	@Override
	@Transactional
	public Images save(Images image) {

		return repoImg.save(image);
	}
	
	

}

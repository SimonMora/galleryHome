package com.accenture.springEurekaImage.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.springEurekaImage.entities.Image;
import com.accenture.springEurekaImage.repository.ImageRepository;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepository repoImg;
	
	@Override
	@Transactional
	public List<Image> findAll() {

		return repoImg.findAll();
	}
	
	@Override
	public List<Image> findByGalleryId(Long galleryId){
		return repoImg.findByGalleryId(galleryId);
	}

	@Override
	@Transactional
	public Image save(Image image) {

		return repoImg.save(image);
	}

	@Override
	public Image findById(Long id) {
		
		return repoImg.findById(id).orElse(null);
	}

	@Override
	public void delete(Image image) {
		repoImg.delete(image);
		
	}
	
	

}

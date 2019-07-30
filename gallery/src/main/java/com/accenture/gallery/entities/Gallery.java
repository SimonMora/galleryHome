package com.accenture.gallery.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Gallery {
	
	@Id
	@GeneratedValue
	private Long id;
	@Transient
	private List<Object> images;
	
	public Gallery() {
		
	}

	public Gallery(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Object> getImages() {
		return images;
	}
	
	public void setImages(List<Object> images) {
		this.images = images;
	}
	
	

}

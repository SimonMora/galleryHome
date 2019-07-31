package com.accenture.gallery.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.accenture.gallery.entities.Image;

@FeignClient(name="image-service")
public interface ImageClientRest {
	
	@GetMapping("/images")
	public ResponseEntity<Object> getImages();
	
	@PostMapping("/guardar")
	public ResponseEntity<Object> saveImage(Image image);

}

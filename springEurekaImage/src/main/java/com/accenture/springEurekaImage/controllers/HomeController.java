package com.accenture.springEurekaImage.controllers;


import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.springEurekaImage.entities.Images;
import com.accenture.springEurekaImage.repository.ImageRepository;
import com.accenture.springEurekaImage.service.ImageService;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private Environment env;
	@Autowired
	private ImageService imageService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/images")
	public ResponseEntity<Object> getImages() throws JSONException {
		List<Images> images = imageService.findAll();
		JSONObject obj = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject json = new JSONObject();
		for(Images img: images) {
			obj.put("title", img.getTitle());
			obj.put("url", img.getUrl());
			obj.put("id", img.getId());
			obj.put("gallery_id", img.getGallery_id());
			
			array.put(obj);
		}
		json.put("error",0);
		json.put("results", array);
		
				return ResponseEntity.ok().body(json.toString());
	}
	
//	@RequestMapping("/imagenes")
//	public List<Images> getImagenes(){
//		List<Images> images = Arrays.asList(
//				new Images(1L,"This is Seiya","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSivYtxeq7nc1YXwqglLHxSIz8wC8qWm4yUk23PhWUFlIwl4PaBCw"),
//				new Images(2L,"Shiryu: Caballero del Dragón","http://3.bp.blogspot.com/-kqyGNo6HBYY/UeCHb8QREvI/AAAAAAAALIQ/Gutp3BhWAvM/s400/XF32.jpg"),
//				new Images(3L,"Andromeda y sus cadenas","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSg7owBJ-yMubI6GXnC-UVZLGIUdKtaBptsHo0RTmQ6rKJV67iC"));
//		return images;
//	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Object> saveImage(@RequestBody Images imagen) throws JSONException{

		Images unaimagen = new Images();
		JSONObject res= new JSONObject();
		
			if(imagen!=null) {
				
				unaimagen.setTitle(imagen.getTitle());
				unaimagen.setUrl(imagen.getUrl());
				unaimagen.setGallery_id(imagen.getGallery_id());
				imageService.save(unaimagen);
				System.out.println(unaimagen.getTitle());
				
				res.put("error", 0);
				res.put("result", "pudimos salvar tu imagen");
					
				
			}else {
				res.put("error", 1);
				res.put("result", "no pudimos salvar tu imagen");	
			}
		return ResponseEntity.ok().body(res.toString());
	}
}

package com.accenture.gallery.entities;

public class Image {
	private Long id;
	private String title;
	private Long gallery_id;
	private String url;
	
	
	public Image() {
		
	}
	public Image(Long id, String title, String url, Long gallery_id) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.gallery_id = gallery_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getGallery_id() {
		return gallery_id;
	}
	public void setGallery_id(Long gallery_id) {
		this.gallery_id = gallery_id;
	}
}

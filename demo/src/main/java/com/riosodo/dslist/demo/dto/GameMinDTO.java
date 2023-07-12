package com.riosodo.dslist.demo.dto;

import com.riosodo.dslist.demo.entities.Game;
import com.riosodo.dslist.demo.projections.GameMinProjection;


public class GameMinDTO {
private Long id;
	
	private String title;
	
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}
	
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	public GameMinDTO(GameMinProjection proj) {
		this.id = proj.getId();
		this.title = proj.getTitle();
		this.year = proj.getYear();
		this.imgUrl = proj.getImgUrl();
		this.shortDescription = proj.getShortDescription();
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	
}

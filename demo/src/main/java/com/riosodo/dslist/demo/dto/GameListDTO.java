package com.riosodo.dslist.demo.dto;

import org.springframework.beans.BeanUtils;

import com.riosodo.dslist.demo.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	public GameListDTO() {
		
	}
	public GameListDTO(GameList ent) {
		id = ent.getId();
		name = ent.getName();
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}

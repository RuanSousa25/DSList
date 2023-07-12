package com.riosodo.dslist.demo.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riosodo.dslist.demo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}

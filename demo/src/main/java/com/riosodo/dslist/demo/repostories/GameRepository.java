package com.riosodo.dslist.demo.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riosodo.dslist.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}

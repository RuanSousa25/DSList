package com.riosodo.dslist.demo.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.riosodo.dslist.demo.dto.*;
import com.riosodo.dslist.demo.entities.Game;
import com.riosodo.dslist.demo.entities.GameList;
import com.riosodo.dslist.demo.projections.GameMinProjection;
import com.riosodo.dslist.demo.repostories.GameListRepository;
import com.riosodo.dslist.demo.repostories.GameRepository;
@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex,obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex? destinationIndex : sourceIndex;
		
		
		for(int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
		
	}
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//		Game result = gameRepository.findById(id).get();
//		return new GameDTO(result);
//	}
}

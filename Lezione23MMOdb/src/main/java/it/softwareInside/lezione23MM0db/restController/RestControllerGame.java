package it.softwareInside.lezione23MM0db.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.lezione23MM0db.models.Game2;
import it.softwareInside.lezione23MM0db.services.GameService;

@RestController
public class RestControllerGame {
	
	@Autowired
	GameService gameService;
	
	@GetMapping("/api")
	public Game2[] getGames(){
		return gameService.getGames();
	}
	
	@GetMapping("/add")
	public boolean addGamesDB() {
		return gameService.addGameInDb(getGames());
	}
	
	@DeleteMapping("/delete")
	public boolean deleteAll() {
		return gameService.deleteAll();
	}
	
	@GetMapping("/getAll")
	public Iterable<Game2> getAll(){
		return gameService.getAllGames();
	}
	
}

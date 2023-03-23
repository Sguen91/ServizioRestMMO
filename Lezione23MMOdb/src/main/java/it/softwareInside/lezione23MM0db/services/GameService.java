package it.softwareInside.lezione23MM0db.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.lezione23MM0db.models.Game2;
import it.softwareInside.lezione23MM0db.repository.GameRepository;
import jakarta.validation.Valid;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;

	public Game2[] getGames() {
		try {

			RestTemplate restTemplate = new RestTemplate();

			ResponseEntity<Game2[]> gameList = restTemplate.getForEntity("https://www.mmobomb.com/api1/games",
					Game2[].class);
			return gameList.getBody();

		} catch (Exception e) {
			System.out.println("errore: " + e);
			return null;
		}
	}

	public boolean addGameInDb(@Valid Game2[] gameList) {

		try {

			for (int i = 0; i < gameList.length; i++) {
				gameRepository.save(gameList[i]);
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteAll() {
		try {

			gameRepository.deleteAll();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Iterable<Game2> getAllGames() {

		return gameRepository.findAll();

	}

}

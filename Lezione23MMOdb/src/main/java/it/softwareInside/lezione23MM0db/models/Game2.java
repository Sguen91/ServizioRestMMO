package it.softwareInside.lezione23MM0db.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Game2 {

	@Id
	private int id;

	@NotNull
	private String title;

	@NotNull
	private String game_url;

	@NotNull
	private String genre;

	@NotNull
	private String platform;
	
	@NotNull
	private String release_date;
}


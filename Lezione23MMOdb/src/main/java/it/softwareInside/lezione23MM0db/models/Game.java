package it.softwareInside.lezione23MM0db.models;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Game {

	
	@Id
	private int id;

	@NotNull
	private String title;

	@NotNull
	private String thumbnail;

	@NotNull
	
	private String short_description;

	@NotNull
	private String game_url;

	@NotNull
	private String genre;

	@NotNull
	private String platform;

	@NotNull
	private String publisher;

	@NotNull
	private String developer;

	@NotNull
	private String release_date;

	@NotNull
	private String profile_url;
}



package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="videogames")
public class Videogame {

	// Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String platform;
	private String developer;
	private String gender;
	
	// Constructor
	public Videogame(String title, String platform, String developer, String gender) {
		this.title = title;
		this.platform = platform;
		this.developer = developer;
		this.gender = gender;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPlatform() {
		return platform;
	}

	public String getDeveloper() {
		return developer;
	}

	public String getGender() {
		return gender;
	}

	// toString method
	@Override
	public String toString() {
		return "Videogame [id=" + id + ", title=" + title + ", platform=" + platform + ", developer=" + developer
				+ ", gender=" + gender + "]";
	}
}

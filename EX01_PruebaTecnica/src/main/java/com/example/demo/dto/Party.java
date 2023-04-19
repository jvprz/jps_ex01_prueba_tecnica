package com.example.demo.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name="parties")
public class Party {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	@ManyToOne
	@JoinColumn(name="creator")
	private User creator;
	@ManyToOne
	@JoinColumn(name="game")
	private Videogame game;
	@CreationTimestamp
	private LocalDateTime creation_date;
	
	// Construcctor
	public Party(String name, String description, User creator, Videogame game) {
		this.name = name;
		this.description = description;
		this.creator = creator;
		this.game = game;
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Videogame getGame() {
		return game;
	}

	public void setGame(Videogame game) {
		this.game = game;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getCreation_date() {
		return creation_date;
	}

	// toString method
	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", description=" + description + ", creator=" + creator
				+ ", game=" + game + ", creation_date=" + creation_date + "]";
	}
}

package com.example.demo.dto;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Message {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	@CreationTimestamp
	private LocalDateTime creation_date;
	@ManyToOne
	@JoinColumn(name="author")
	private User author;
	@ManyToOne
	@JoinColumn(name="party")
	private Party party;
	
	// Constructor
	public Message(String content, User author, Party party) {
		this.content = content;
		this.author = author;
		this.party = party;
	}

	// Getters & Setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
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
		return "Message [id=" + id + ", content=" + content + ", creation_date=" + creation_date + ", author=" + author
				+ ", party=" + party + "]";
	}
}

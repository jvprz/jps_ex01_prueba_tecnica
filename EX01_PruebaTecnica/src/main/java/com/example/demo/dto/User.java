package com.example.demo.dto;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String mail;
	private String name;
	private String last_name;
	private String steam;
	@CreationTimestamp
	private LocalDateTime creation_date;
	
	// Construcctor
	public User(String username, String password, String mail, String name, String last_name, String steam) {
		this.username = username;
		this.password = password;
		this.mail = mail;
		this.name = name;
		this.last_name = last_name;
		this.steam = steam;
	}

	// Getters & Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSteam() {
		return steam;
	}

	public void setSteam(String steam) {
		this.steam = steam;
	}

	// toSting method
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", mail=" + mail + ", name="
				+ name + ", last_name=" + last_name + ", steam=" + steam + ", creation_date=" + creation_date + "]";
	}
		
}

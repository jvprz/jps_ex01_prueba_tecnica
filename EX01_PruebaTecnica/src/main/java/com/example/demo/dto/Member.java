package com.example.demo.dto;

import java.time.LocalDateTime;
import org.hibernate.annotations.*;

import com.example.demo.dto.support.MembersId;

import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name="members")
public class Member {
	
	// Attributes
		@EmbeddedId
		private MembersId id;
		
		@ManyToOne
		@MapsId("memberId")
		@JoinColumn(name = "member")
		private User member;
		
		@ManyToOne
		@MapsId("partyId")
		@JoinColumn(name = "party")
		private Party party;
	@CreationTimestamp
	private LocalDateTime union_date;
	
	public Member(User member, Party party) {
	    this.member = member;
	    this.party = party;
	    this.id = new MembersId(member, party);
	}

	// Getters & Setters
	public User getMember() {
		return member;
	}

	public void setMember(User member) {
		this.member = member;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public MembersId getId() {
		return id;
	}

	public LocalDateTime getUnion_date() {
		return union_date;
	}

	// toString method
	@Override
	public String toString() {
		return "Member [id=" + id + ", member=" + member + ", party=" + party + ", union_date=" + union_date + "]";
	}	
}

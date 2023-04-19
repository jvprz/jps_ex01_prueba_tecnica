package com.example.demo.dto.support;

import com.example.demo.dto.Party;
import com.example.demo.dto.User;

import jakarta.persistence.*;

@Embeddable
public class MembersId {
	@ManyToOne
	@JoinColumn(name="member")
	private User member;
	@ManyToOne
	@JoinColumn(name="party")
	private Party party;
	
	public MembersId(User member, Party party) {
		this.member = member;
		this.party = party;
	}

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
	
	
}


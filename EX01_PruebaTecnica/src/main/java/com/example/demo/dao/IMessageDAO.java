package com.example.demo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Message;
import com.example.demo.dto.Party;

public interface IMessageDAO extends JpaRepository<Message, Long>{
	
	// List messages by party
	public List<Message> findByPartyId(Long partyId);
	
}

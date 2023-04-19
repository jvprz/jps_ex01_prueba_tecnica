package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.IPartyDAO;
import com.example.demo.dto.Party;

public class IPartyService {

	@Autowired
	IPartyDAO iPartyDAO;
	
	public List<Party> listParties() {
		return iPartyDAO.findAll();
	}
	
	public Party saveParty(Party party) {
		return iPartyDAO.save(party);
	}
	
	public Party partyById(Long id) {
		return iPartyDAO.findById(id).get();
	}
	
	public List<Party> listPartiesByName(String name) {
		return iPartyDAO.findByName(name);
	}
	
	public Party updateParty(Party party) {
		return iPartyDAO.save(party);
	}
	
	public void deleteParty(Long id) {
		iPartyDAO.deleteById(id);
	}
}

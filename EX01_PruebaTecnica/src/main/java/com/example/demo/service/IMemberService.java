package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IMemberDAO;
import com.example.demo.dto.Member;
import com.example.demo.dto.Party;
import com.example.demo.dto.User;

public class IMemberService {
	
	@Autowired
	IMemberDAO iMemberDAO;
	
	public List<Member> listMembers() {
		return iMemberDAO.findAll();
	}
	
	public Member saveMember(Member member) {
		return iMemberDAO.save(member);
	}
	
	public void deleteMember(User member, Party party) {
		iMemberDAO.deleteByIdMemberAndIdParty(member, party);
	}

}

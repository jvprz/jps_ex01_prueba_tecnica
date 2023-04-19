package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Member;
import com.example.demo.dto.Party;
import com.example.demo.dto.User;
import com.example.demo.dto.support.MembersId;

public interface IMemberDAO extends JpaRepository<Member, MembersId>{
	
	public void deleteByIdMemberAndIdParty(User member, Party party);
}

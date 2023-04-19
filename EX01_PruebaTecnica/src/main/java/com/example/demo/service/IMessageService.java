package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dto.Message;

public class IMessageService {
	
	@Autowired
	IMessageService iMessageService;
	
	public List<Message> findByPartyId(Long id) {
		return iMessageService.findByPartyId(id);
	}
	
	public Message saveMessage(Message message) {
		return iMessageService.saveMessage(message);
	}
	
	public Message updateMessage(Message message) {
		return iMessageService.updateMessage(message);
	}
	
	public void deleteMessage(Long id) {
		iMessageService.deleteMessage(id);
	}
}

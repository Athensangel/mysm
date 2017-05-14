package com.mysm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mysm.mapper.MessageMapper;
import com.mysm.model.Message;
import com.mysm.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Resource 
	private MessageMapper messageMapper;

	@Override
	public void updateMessage(Message message) {
		messageMapper.updateMessage(message);
	}

	@Override
	public Message findMessageById(String id) {
		return messageMapper.findMessageById(id);
	}

	@Override
	public List<Message> findMessages() {
		return messageMapper.queryAllMessage();
	}

	@Override
	public void saveMessages(Message message) {
		messageMapper.insertMessages(message);
		
	}

	@Override
	public void deleteMessage(String id) {
		messageMapper.delMessage(id);
		
	}

	@Override
	public void batchInsertMessage(List<Message> messageList) {
		messageMapper.batchInsertMessage(messageList);
		
	}

	@Override
	public void batchUpdateMessage(List<String> list) {
		messageMapper.batchUpdateMessage(list);
	}

	@Override
	public void batchDeleteMessage(List<String> list) {
		messageMapper.batchDeleteMessage(list);
		
	}
	
}

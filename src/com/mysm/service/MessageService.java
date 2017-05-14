package com.mysm.service;

import java.util.List;

import com.mysm.model.Message;

/**
 * 接口MessageService
 * @author Administrator
 *
 */
public interface MessageService {

	public List<Message> findMessages();//查询所有留言表中的信息
	
	public void saveMessages(Message message);//插入一条留言
	
	public void deleteMessage(String id);//删除一条留言
	
	public void updateMessage(Message message);//更新一条留言
	
	public Message findMessageById(String id);//通过id查询一条数据
	
	public void batchInsertMessage(List<Message> messageList);//批量新增
	
	public void batchUpdateMessage(List<String> list);//批量修改
	
	public void batchDeleteMessage(List<String> list);//批量删除
}

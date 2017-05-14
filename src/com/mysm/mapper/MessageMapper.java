package com.mysm.mapper;

import java.util.List;

import com.mysm.model.Message;
/**
 * MessageMapper接口
 * 
 * @author Administrator
 *
 */
public interface MessageMapper {

	public List<Message> queryAllMessage();// 查询所有留言表中的信息

	public void insertMessages(Message message);// 插入一条留言

	public void delMessage(String id);// 删除一条留言

	public void updateMessage(Message message);// 更新一条留言

	public Message findMessageById(String id);// 通过id查询一条数据

	public void batchInsertMessage(List<Message> messageList);

	public void batchUpdateMessage(List<String> list);

	public void batchDeleteMessage(List<String> list);

}

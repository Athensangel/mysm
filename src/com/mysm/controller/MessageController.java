package com.mysm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mysm.model.Message;
import com.mysm.service.MessageService;

@Controller
@RequestMapping(value = "message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	/**
	 * 查询留言的所有数据
	 * @param map
	 * @return
	 */
	@RequestMapping("getMessageIndex")
	public String getMessageIndex(ModelMap map){
		List<Message> messageList = messageService.findMessages();
		System.out.println("messageList");
		map.put("messageList", messageList);
		return "message/messageList";
	}
	
	/**
	 * 跳转到添加页面
	 * @return
	 */
	@RequestMapping(value="jumpMessageAdd",method = RequestMethod.GET)
	public ModelAndView jumpMessageAdd(){
		ModelAndView modelAndView = new ModelAndView("message/messageAdd");
		return modelAndView;
	}
	
	/**
	 * 新增一条数据
	 * @param message
	 * @return
	 */
	@RequestMapping("saveMessages")
	public ModelAndView saveMessages(Message message){
		message.setId(getUUID());
		ModelAndView andView = new ModelAndView();
		andView.setView(new RedirectView("getMessageIndex"));
		messageService.saveMessages(message);
		return andView;
	}
	
	/**
	 * 跳转到留言修改页
	 * @return
	 */
	@RequestMapping("jumpUpdateMessage")
	public ModelAndView jumpUpdateMessage(String id){
		ModelAndView view = new ModelAndView();
		view.setViewName("message/messageUp");
		Message message = messageService.findMessageById(id);
		view.addObject("message",message);
		return view;
	}
	
	/**
	 * 留言修改页
	 * @param message
	 * @return
	 */
	@RequestMapping(value="/updateMessage",method=RequestMethod.POST)
	public String updateMessage(Message message){
		messageService.updateMessage(message);
		return "redirect:getMessageIndex";
	}
	
	/**
	 * 留言删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="deleteMessage",method=RequestMethod.GET)
	public ModelAndView deleteMessage(@RequestParam String id){
		messageService.deleteMessage(id);
		return new ModelAndView("redirect:getMessageIndex");
	}
	/**
	 * 给id一个UUID()
	 * @return
	 */
	private String getUUID() {
		String s = UUID.randomUUID().toString(); 
	      //去掉“-”符号 
	      return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
	}
	
	/**
	 * 测试批量新增
	 */
	@RequestMapping(value="testBatchInsertMessage",method=RequestMethod.GET)
	public ModelAndView testBatchInsertMessage(String id){
		List<Message> ls = new ArrayList<Message>();
		for (int i = 0; i < 8; i++) {
			Message message = new Message();
			message.setId(getUUID());
			message.setName("益生菌" + i);
			message.setCreateTime("2017-05-08");
			message.setContent("你回家吃饭吗" + i);
			message.setEmail("123@sina.com");
			ls.add(message);
		}
		messageService.batchInsertMessage(ls);
		return null;
	}
	
	/**
	 * 测试批量修改
	 */
	@RequestMapping(value="testBatchUpdateMessage",method=RequestMethod.GET)
	public ModelAndView testBatchUpdateMessage(){
		 List<String> ls = new ArrayList<String>();  
		 ls.add("e749005734984203ad5f1582132cec4e");
		 ls.add("e39a2bea0dbe407e872ee1e63c2b4817");
		 ls.add("d9d5bd52fc9f438db7883412cace6a65");
		 ls.add("d83eec5c0b13432f81f40fa7a82bf5e4");
		 ls.add("c5038f7e3557424e8107186d7f6ce9d3");
		 ls.add("c20d8bcef5be4d3a83859eb6e8c4bc52");
		 ls.add("95b7624fa4304094ab642d7a200f8465");
		 messageService.batchUpdateMessage(ls);
	   return null;
	}
	
	/**
	 * 测试批量删除
	 */
	@RequestMapping(value="testBatchDeleteMessage",method=RequestMethod.GET)
	public ModelAndView testBatchDeleteMessage(){
		 List<String> ls = new ArrayList<String>();  
		 ls.add("e749005734984203ad5f1582132cec4e");
		 ls.add("e39a2bea0dbe407e872ee1e63c2b4817");
		 ls.add("d9d5bd52fc9f438db7883412cace6a65");
		 ls.add("d83eec5c0b13432f81f40fa7a82bf5e4");
		 ls.add("c5038f7e3557424e8107186d7f6ce9d3");
		 ls.add("c20d8bcef5be4d3a83859eb6e8c4bc52");
		 ls.add("95b7624fa4304094ab642d7a200f8465");
		 messageService.batchDeleteMessage(ls);
	   return null;
	}
	
}

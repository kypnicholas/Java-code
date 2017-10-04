package org.kypnicholas.practice.simpleMessenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.kypnicholas.practice.simpleMessenger.database.DatabaseClass;
import org.kypnicholas.practice.simpleMessenger.exception.DataNotFoundException;
import org.kypnicholas.practice.simpleMessenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();			//Sample data retrieval
	
	public MessageService() {
		messages.put(1L, new Message(1, "Message One", "Nicholas"));
		messages.put(2L, new Message(2, "Message Two", "Nicholas"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 						//Will return all the values of 'messages' map 
	}
	
	public List<Message> getAllMessagesForYear(int year) {
		List<Message> messagesForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);
			}
		}
		return messagesForYear;
	}
	
	public List<Message> getAllMessagesPaginated(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if (start + size > list.size()) return new ArrayList<Message>();
		return list.subList(start, start + size); 
	}
	
	
	public Message getMessage(long id) {							//pass a message id and return the message with that id
		Message message = messages.get(id);
		if (message==null) {
			throw new DataNotFoundException("Message with id " + id + " not found");
		}
		return message;
	}
	
	public Message addMessage(Message message) {					//pass the new message, increase the id+1 and then add it to 'messages' map 
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {					
		if (message.getId() <= 0) {									//if message id is not greater than zero, then message does not exist. 
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	

}

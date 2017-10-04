package org.kypnicholas.practice.simpleMessenger.database;

import java.util.HashMap;
import java.util.Map;

import org.kypnicholas.practice.simpleMessenger.model.Message;
import org.kypnicholas.practice.simpleMessenger.model.Profile;

/*
 * THIS CLASS ACTS AS A STUB FOR A DATABASE CONNECTION (where you would ideally have a JDBC or HIBERNATE classes)
 * */
public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	//ANY CLASS IN THE APPLICATION CAN NOW ACCESS THE TWO MAPS FOR MESSAGES AND PROFILES BY CALLING THE STATIC METHODS BELOW
	
	public static Map<Long, Message> getMessages() {		
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}

}

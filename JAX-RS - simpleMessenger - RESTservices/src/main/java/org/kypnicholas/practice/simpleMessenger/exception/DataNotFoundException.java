package org.kypnicholas.practice.simpleMessenger.exception;

public class DataNotFoundException extends RuntimeException{	//because we want it to be thrown at runtime

	/**
	 * 
	 */
	private static final long serialVersionUID = 8389176642002324404L;

	public DataNotFoundException(String message) {
		super(message);
	}	
	
	

}

package org.kypnicholas.practice.simpleMessenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.kypnicholas.practice.simpleMessenger.model.ErrorMessage;

//The @Provider annotation registers this class with JAX-RS so that it knows it exists and can map the exception	
@Provider																						
public class DataNotFoundExceptionMapper implements ExceptionMapper <DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 404, "https://javabrains.io");
		return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
	

}

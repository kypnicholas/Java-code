package org.kypnicholas.practice.simpleMessenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.kypnicholas.practice.simpleMessenger.model.ErrorMessage;

@Provider								//By commenting the @Provider annotation I disabled this generic exception mapper 
public class GenericExceptionMapper implements ExceptionMapper <Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 500, "generic error implemented to cater for all error so we save time and dont have to do an exception mapper for each, even though we should");
		return Response.status(javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR)
				.entity(errorMessage)
				.build();
	}

}

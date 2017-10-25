package org.kypnicholas.practice.simpleMessenger.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.kypnicholas.practice.simpleMessenger.resources.CommentResource;
import org.kypnicholas.practice.simpleMessenger.resources.beans.MessageFilterBean;
import org.kypnicholas.practice.simpleMessenger.model.Message;
import org.kypnicholas.practice.simpleMessenger.service.MessageService;

@Path("messages")														//THIS ANNOTATION MAPS THE URLs WHOSE PATH ENDS IN "/messages" TO THIS CLASS
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})				 
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})					//Supporting multiple content types	
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getJsonMessages(@BeanParam MessageFilterBean filterBean) {
		System.out.println("Json method called");
		if (filterBean.getYear() > 0) {
			return messageService.getAllMessagesForYear(filterBean.getYear());
		}
		if (filterBean.getStart() >= 0 && filterBean.getSize() > 0) {
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		}
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public List<Message> getXmlMessages(@BeanParam MessageFilterBean filterBean) {
		System.out.println("XML method called");
		if (filterBean.getYear() > 0) {
			return messageService.getAllMessagesForYear(filterBean.getYear());
		}
		if (filterBean.getStart() >= 0 && filterBean.getSize() > 0) {
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		}
		return messageService.getAllMessages();
	}
	
	@POST
	public Response addMessage(Message message, @Context UriInfo uriInfo) {
		Message newMessage = messageService.addMessage(message);
		String newId = String.valueOf(newMessage.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)											//we return the URI as well as STATUS CODE since we are using the created()
				.entity(newMessage)												//and the whole 'Message' instance payload						
				.build();														//then build() using the 'ResponseBuilder'
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	@GET
	@Path("/{messageId}")							//THIS ANNOTATION MAPS the URLs ENDING IN "/messages/{messageId}" TO THIS 'GET' METHOD
	public Message getMessage(@PathParam("messageId") long id, @Context UriInfo uriInfo) {		//@PathParam annotation takes the param passed in the path (URL) and passes it as arg to the getMessage()
		Message message = messageService.getMessage(id);
		message.addLink(getUriForSelf(uriInfo, message), "self");
		message.addLink(getUriForProfile(uriInfo, message), "profile");
		message.addLink(getUriForComments(uriInfo, message), "comments");
		return message;
	}
	
	//we cannot build the path like we did for 'messages' and 'profiles' because 'comments is a sub-resource'
		private String getUriForComments(UriInfo uriInfo, Message message) {
			URI uri = uriInfo.getBaseUriBuilder()														//	http://localhost:8080/messenger/webapi/
					.path(MessageResource.class)														//	/messages
					.path(MessageResource.class, "getCommentResource")									// /{messageId}/comments
					.path(CommentResource.class)	
					.resolveTemplate("messageId", message.getId())								//Replace the argument passed in the getCommentResouce() with the actual commentId
					.build();
			return uri.toString();
		}

		private String getUriForProfile(UriInfo uriInfo, Message message) {
			URI uri = uriInfo.getBaseUriBuilder()														//	http://localhost:8080/messenger/webapi/
					.path(ProfileResource.class)														// /profiles		
					.path(message.getAuthor())															// /{authorName}
					.build();
			return uri.toString();
		}

		private String getUriForSelf(UriInfo uriInfo, Message message) {
			String uri = uriInfo.getBaseUriBuilder()													//	http://localhost:8080/messenger/webapi/
					.path(MessageResource.class)														//	/messages
					.path(Long.toString(message.getId()))												//	/{messageId}
					.build().toString();
					return uri;
		}
		
		@Path("{messageId}/comments")
		public CommentResource getCommentResource() {
			return new CommentResource();
		}
	

}

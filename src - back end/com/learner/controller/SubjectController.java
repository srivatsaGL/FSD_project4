package com.learner.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner.model.Subject;
import com.learner.service.SubjectService;
import com.learner.service.implementation.SubjectServiceImplementation;

@Path("/subject")
public class SubjectController {
	
	private SubjectService service = new SubjectServiceImplementation();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubjects() {
		// Presentation Layer, Entry point of the application with URI "/subject"
		return service.getAllSubjectList();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject createSubject(Subject subject) {
		// Presentation Layer to create the subject
		return service.createSubject(subject);
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Subject getSubjectById(@PathParam("id")int id) {
		// Presentation Layer to get the subject by the id entered in the URI
		return service.getSubjectById(id);
	}
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject updateSubject(Subject subject) {
		// Presentation Layer to update the subject
		return service.updateSubject(subject);
	}
	
	@DELETE
	@Path("/{id}")
	public void removeSubject(@PathParam("id")int id) {
		service.removeSubject(id);
	}
}

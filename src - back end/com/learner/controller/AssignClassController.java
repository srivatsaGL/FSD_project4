package com.learner.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner.service.SubjectService;
import com.learner.service.implementation.SubjectServiceImplementation;
import com.learner.model.Subject;

@Path("/assign")
public class AssignClassController {
	
	SubjectService service = new SubjectServiceImplementation();
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject updateSubject(Subject subject) {
		return service.updateSubject(subject);
	}
}


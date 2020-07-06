package com.learner.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
public class AcademyController {
	
	@GET
	public String Welcome() {
		return "Welcome!!";
	}
}

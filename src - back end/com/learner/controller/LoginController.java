package com.learner.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.learner.model.Login;
import com.learner.service.LoginService;
import com.learner.service.implementation.LoginServiceImplementation;


@Path("/login")
public class LoginController {

	private LoginService service = new LoginServiceImplementation();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validateLogin(Login login){
	//	return service.validateLogin(login);
		return Response.ok(service.validateLogin(login),MediaType.APPLICATION_JSON).build();
	}
}

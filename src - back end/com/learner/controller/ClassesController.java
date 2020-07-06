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
import javax.ws.rs.core.Response;

import com.learner.service.ClassesService;
import com.learner.service.implementation.ClassesServiceImplementation;
import com.learner.model.Classes;
import com.learner.model.Student;
import com.learner.model.Subject;

@Path("/class")
public class ClassesController {
	
	ClassesService service = new ClassesServiceImplementation();

	@GET
	public Response getAllClasses() {
		return Response.ok(service.getAllClasses(), MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createClass(Classes classes) {
		return Response.ok(service.createClasses(classes), MediaType.APPLICATION_JSON).build();
	}

	@GET
	@Path("/{id}")
	public Response getClassById(@PathParam("id") int id) {
		try {
			return Response.ok(service.getClassById(id), MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}
	

	
	@GET
	@Path("/student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getAllStudents(@PathParam("id")int id){
		return service.getStudentById(id);
	}

	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
		public Response updateClass(Classes classes) {
		return Response.ok(service.updateClass(classes), MediaType.APPLICATION_JSON).build();
	}
	
	@PATCH
	@Path("/subject")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> updateSubject(Classes classes){
		return service.updateSubject(classes);
	}
	
	@PATCH
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateStudent(Classes classes){
		return Response.ok(service.updateStudent(classes), MediaType.APPLICATION_JSON).build();
	}

	@DELETE
	@Path("/{id}")
	public void removeClass(@PathParam("id") int id) {
		service.removeClass(id);
		System.out.println("Successfully deleted");
	}
	
}

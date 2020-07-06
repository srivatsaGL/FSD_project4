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

import com.learner.model.Student;
import com.learner.service.StudentService;
import com.learner.service.implementation.StudentServiceImplementation;

@Path("/student")
public class StudentController {
	

	private StudentService service = new StudentServiceImplementation();

	@GET
	public Response getAllStudents() {
		// Presentation Layer, Entry point of the application with URI "/student"
		return Response.ok(service.getAllStudentList(), MediaType.APPLICATION_JSON).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createStudent(Student student) {
		// Presentation Layer to create the student
		return  
				Response.ok(service.createStudent(student), MediaType.APPLICATION_JSON).build();
		
	}
	
	@GET
	@Path("/{id}")
	public Response getStudentById(@PathParam("id")int id) {
		// Presentation Layer to get the student by the id entered in the URI
		try {
			return Response.ok(service.getStudentById(id), MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
		
		
	}
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateStudent(Student student) {
		// Presentation Layer to update the student
		return Response.ok(service.updateStudent(student), MediaType.APPLICATION_JSON).build();
	}
	
	@DELETE
	@Path("/{id}")
	public void removeStudent(@PathParam("id")int id) {
		 service.removeStudent(id);
	}

}

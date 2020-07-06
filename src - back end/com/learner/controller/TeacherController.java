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
import com.learner.model.Subject;
import com.learner.model.Teacher;
import com.learner.service.TeacherService;
import com.learner.service.implementation.TeacherServiceImplementation;

@Path("/teacher")
public class TeacherController {

	private TeacherService service = new TeacherServiceImplementation();

	@GET
	public Response getAllTeachers() {
		return Response.ok(service.getAllTeacherList(),MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher createTeacher(Teacher teacher) {
		return service.createTeacher(teacher);
	}

	@GET
	@Path("/{id}")
	public Teacher getTeacherById(@PathParam("id") int id) {
		return service.getTeacherById(id);
	}

	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateTeacher(Teacher teacher) {
		return Response.ok(service.updateTeacher(teacher),MediaType.APPLICATION_JSON).build();
	}

	@PATCH
	@Path("/subject")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> updateSubject(Teacher teacher){
		return service.updateSubject(teacher);
	}
	@PATCH
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> updateStudent(Teacher teacher){
		return service.updateStudent(teacher);
	}
	
	@DELETE
	@Path("/{id}")
	public void removeTeacher(@PathParam("id") int id) {
		service.removeTeacher(id);

	}
}

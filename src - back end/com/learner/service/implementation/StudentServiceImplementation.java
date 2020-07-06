package com.learner.service.implementation;

import java.util.List;

import com.learner.dao.StudentDAO;
import com.learner.dao.implementation.StudentDaoImplementation;
import com.learner.service.StudentService;
import com.learner.model.Student;

public class StudentServiceImplementation implements StudentService{
	
	StudentDAO dao = new StudentDaoImplementation();
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentById(id);
	}

	@Override
	public List<Student> getAllStudentList() {
		// TODO Auto-generated method stub
		return dao.getAllStudentList();
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		dao.removeStudent(id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}
	
	

}
package com.learner.service.implementation;

import java.util.List;

import com.learner.dao.TeacherDAO;
import com.learner.dao.implementation.TeacherDaoImplementation;
import com.learner.service.TeacherService;
import com.learner.model.Student;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public class TeacherServiceImplementation implements TeacherService{
	
	TeacherDAO dao = new TeacherDaoImplementation();
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return dao.getTeacherById(id);
	}

	@Override
	public List<Teacher> getAllTeacherList() {
		// TODO Auto-generated method stub
		return dao.getAllTeacherList();
	}

	@Override
	public void removeTeacher(int id) {
		// TODO Auto-generated method stub
		dao.removeTeacher(id);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.updateTeacher(teacher);
	}

	@Override
	public List<Subject> updateSubject(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.updateSubject(teacher);
	}

	@Override
	public List<Student> updateStudent(Teacher teacher) {
		// TODO Auto-generated method stub
		return  dao.updateStudent(teacher);
	}

	
	
}

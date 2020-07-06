package com.learner.service.implementation;

import java.util.List;

import com.learner.dao.ClassesDAO;
import com.learner.dao.implementation.ClassesDaoImplementation;
import com.learner.service.ClassesService;
import com.learner.model.Classes;
import com.learner.model.Student;
import com.learner.model.Subject;

public class ClassesServiceImplementation implements ClassesService{
	
	ClassesDAO dao = new ClassesDaoImplementation();
	
	@Override
	public Classes createClasses(Classes classes) {
		return dao.createClasses(classes);
	}

	@Override
	public Classes getClassById(int id) {
		// TODO Auto-generated method stub
		return dao.getClassById(id);
	}

	@Override
	public List<Classes> getAllClasses() {
		// TODO Auto-generated method stub
		return dao.getAllClasses();
	}

	@Override
	public void removeClass(int id) {
		// TODO Auto-generated method stub
		dao.removeClass(id);
	}

	@Override
	public Classes updateClass(Classes classes) {
		// TODO Auto-generated method stub
		return dao.updateClass(classes);
	}

	@Override
	public List<Subject> updateSubject(Classes classes) {
		// TODO Auto-generated method stub
		return dao.updateSubject(classes);
	}

	/*@Override
	public List<Student> getAllStudents(int id) {
		// TODO Auto-generated method stub
		return dao.getAllStudents(id);
	}*/

	@Override
	public List<Student> updateStudent(Classes classes) {
		// TODO Auto-generated method stub
		return dao.updateStudent(classes);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentId(id) ;
	}

	@Override
	public List<Student> getAllStudents(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

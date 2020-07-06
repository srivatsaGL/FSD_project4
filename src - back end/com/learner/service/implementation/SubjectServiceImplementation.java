package com.learner.service.implementation;

import java.util.List;

import com.learner.dao.SubjectDAO;
import com.learner.dao.implementation.SubjectDaoImplementation;
import com.learner.service.SubjectService;
import com.learner.model.Subject;

public class SubjectServiceImplementation implements SubjectService{
	
	SubjectDAO dao = new SubjectDaoImplementation();
	@Override
	public Subject createSubject(Subject subject) {
		// TODO Auto-generated method stub
		return dao.createSubject(subject);
	}

	@Override
	public Subject getSubjectById(int id) {
		// TODO Auto-generated method stub
		return dao.getSubjectById(id);
	}

	@Override
	public List<Subject> getAllSubjectList() {
		// TODO Auto-generated method stub
		return dao.getAllSubjectList();
	}

	@Override
	public void removeSubject(int id) {
		// TODO Auto-generated method stub
		dao.removeSubject(id);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return dao.updateSubject(subject);
	}
	
	

}

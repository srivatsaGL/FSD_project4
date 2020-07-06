package com.learner.dao;

import java.util.List;

import com.learner.model.Subject;
import com.learner.model.Teacher;

public interface SubjectDAO {
	public Subject createSubject(Subject subject);
	public Subject getSubjectById(int id);
	public List<Subject> getAllSubjectList();
	public void removeSubject(int id);
	public Subject updateSubject(Subject subject);
	public List<Subject> updateSubject(Teacher teacher);
}
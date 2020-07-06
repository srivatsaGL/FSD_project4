package com.learner.service;

import java.util.List;

import com.learner.model.Teacher;
import com.learner.model.Student;
import com.learner.model.Subject;

public interface TeacherService {
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeacherById(int id);
	public List<Teacher> getAllTeacherList();
	public void removeTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);
	public List<Subject> updateSubject(Teacher teacher);
	public List<Student> updateStudent(Teacher teacher);
	
}

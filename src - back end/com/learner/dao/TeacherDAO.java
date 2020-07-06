package com.learner.dao;

import java.util.List;

import com.learner.model.Student;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public interface TeacherDAO {
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeacherById(int id);
	public List<Teacher> getAllTeacherList();
	public void removeTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);
	public List<Subject> updateSubject(Teacher teacher);
	public List<Student> updateStudent(Teacher teacher);
	
}

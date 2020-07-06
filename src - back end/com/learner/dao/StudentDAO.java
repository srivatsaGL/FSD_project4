package com.learner.dao;

import java.util.List;

import com.learner.model.Student;

public interface StudentDAO {
	public Student createStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudentList();
	public void removeStudent(int id);
	public Student updateStudent(Student student);
}

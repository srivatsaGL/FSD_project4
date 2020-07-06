package com.learner.service;

import java.util.List;

import com.learner.model.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudentList();
	public void removeStudent(int id);
	public Student updateStudent(Student student);
}

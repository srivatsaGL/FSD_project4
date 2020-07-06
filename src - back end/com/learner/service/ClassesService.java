package com.learner.service;

import java.util.List;

import com.learner.model.Classes;
import com.learner.model.Student;
import com.learner.model.Subject;

public interface ClassesService {
	public Classes createClasses(Classes classes);
	public Classes getClassById(int id);
	public List<Classes> getAllClasses();
	public void removeClass(int id);
	public Classes updateClass(Classes classes);
	public List<Subject> updateSubject(Classes classes);
	public List<Student> getAllStudents(int id);
	public List<Student> updateStudent(Classes classes);
	public Student getStudentById(int id);
}

package com.learner.dao;

import java.util.List;

import com.learner.model.Classes;
import com.learner.model.Student;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public interface ClassesDAO {
	public Classes createClasses(Classes classes);
	public Classes getClassById(int id);
	public List<Classes> getAllClasses();
	public void removeClass(int id);
	public Classes updateClass(Classes classes);
	public List<Subject> updateSubject(Classes classes);
	//public List<Student> getAllStudents();
	public List<Student> updateStudent(Classes classes);
	public Teacher getTeacherId(int id);
	public List<Teacher> getAllTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);
	
	public Student getStudentId(int id);
	//public List<Subject> getAllSubjects();
	//public List<Student> getStudentId(int id);
	public List<Subject> getAllSubjects();
}

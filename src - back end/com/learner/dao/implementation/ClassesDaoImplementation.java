package com.learner.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learner.dao.ClassesDAO;
import com.learner.dao.implementation.SessionUtil;
import com.learner.model.Classes;
import com.learner.model.Student;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public class ClassesDaoImplementation implements ClassesDAO {
	
	private static SessionUtil sessionUtil = SessionUtil.getInstance();

	@Override
	public Classes createClasses(Classes classes) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.persist(classes);
		transaction.commit();
		session.close();
		return classes;
	}
	@Override
	public Classes getClassById(int id) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Classes c = (Classes) session.get(Classes.class, id);
		session.save(c);
		transaction.commit();
		session.close();
		return c;
	}
	@Override
	public List<Classes> getAllClasses() {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Classes> classList = session.createQuery("from com.learner.model.Classes").list();
		transaction.commit();
		session.close();
		return classList;
	}
	@Override
	public void removeClass(int id) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Classes c = new Classes();
		c.setClassId(id);
		session.delete(c);
		transaction.commit();
		session.close();
	}
	@Override
	public Classes updateClass(Classes classes) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.update(classes);
		transaction.commit();
		session.close();
		return classes;
	}
	@Override
	public List<Subject> updateSubject(Classes classes) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Subject> subjects = classes.getSubjectList();
		for (Subject subject : subjects) {
			Subject s1 = (Subject) session.get(Subject.class, subject.getSubjectId());
			s1.setClasses(classes);
			session.update(s1);
		}
		transaction.commit();
		session.close();
		return subjects;
	}
	
	@Override
	public Student getStudentId(int id) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Student st = (Student) session.get(Student.class, id);
		session.save(st);
		transaction.commit();
		session.close();
		return st;
	}


	@Override
	public List<Student> updateStudent(Classes classes) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Student> students = classes.getStudents();
		for (Student student : students) {
			Student s1 = (Student) session.get(Student.class, student.getStudentId());
			s1.setClasses(classes);
			session.update(s1);
		}
		transaction.commit();
		session.close();
		return students;
	}

	@Override
	public Teacher getTeacherId(int id) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		Teacher t = (Teacher) session.get(Teacher.class, id);
		session.save(t);
		transaction.commit();
		session.close();
		return t;
	}
	@Override
	public List<Subject> getAllSubjects() {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Subject> subjectList = session.createQuery("from com.learner.model.Subject").list();
		transaction.commit();
		session.close();
		return subjectList;
	}
	@Override
	public List<Teacher> getAllTeacher(int id) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Teacher> teacherList = session.createQuery("from com.learner.model.Teacher").list();
		transaction.commit();
		session.close();
		return teacherList;
	}
	@Override
	public Teacher updateTeacher(Teacher teacher) {
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.update(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

}

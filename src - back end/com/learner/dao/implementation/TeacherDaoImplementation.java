package com.learner.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learner.dao.TeacherDAO;
import com.learner.model.Student;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public class TeacherDaoImplementation implements TeacherDAO {
	
	private static SessionUtil sessionUtil = SessionUtil.getInstance();

		@Override
		public Teacher createTeacher(Teacher teacher) {
			Session session =  sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			session.save(teacher);
			transaction.commit();
			session.close();
			return teacher;
		}
		@Override
		public Teacher getTeacherById(int id) {
			Session session =  sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			Teacher teacher = (Teacher) session.get(Teacher.class, id);
			session.save(teacher);
			transaction.commit();
			session.close();
			return teacher;
		}
		@Override
		public List<Teacher> getAllTeacherList() {
			Session session =  sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			List<Teacher> teacherList = session.createQuery("from com.learner.model.Teacher").list();
			transaction.commit();
			session.close();
			return teacherList;
		}
		@Override
		public void removeTeacher(int id) {
			Session session =  sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			Teacher t = new Teacher();
			t.setTeacherId(id);
			session.delete(t);
			transaction.commit();
			session.close();
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
		@Override
		public List<Subject> updateSubject(Teacher teacher) {
		
			
				Session session =  sessionUtil.getSession();
				Transaction transaction = session.beginTransaction();
				List<Subject> subjects = teacher.getSubjectList();
				for (Subject subject : subjects) {
					Subject s1 = (Subject) session.get(Subject.class, subject.getSubjectId());
					s1.setTeacher(teacher);
					session.update(s1);
				}
				transaction.commit();
				session.close();
				return subjects;
			// TODO Auto-generated method stub
			
		}
		@Override
		public List<Student> updateStudent(Teacher teacher) {
			// TODO Auto-generated method stub
			Session session =  sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			List<Student> students = teacher.getStudentList();
			for (Student student1 : students) {
				Student st = (Student) session.get(Student.class, student1.getStudentId());
				st.setTeacher(teacher);
				session.update(st);
			}
			transaction.commit();
			session.close();
			return students;
		}
		

	}


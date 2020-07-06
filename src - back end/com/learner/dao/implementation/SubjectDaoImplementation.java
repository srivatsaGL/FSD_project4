package com.learner.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learner.dao.SubjectDAO;
import com.learner.model.Subject;
import com.learner.model.Teacher;

public class SubjectDaoImplementation implements SubjectDAO{
	
	private static SessionUtil sessionUtil = SessionUtil.getInstance();

		@Override
		public Subject createSubject(Subject subject) {
			Session session = sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			session.save(subject);
			transaction.commit();
			session.close();
			return subject;
		}
		@Override
		public Subject getSubjectById(int id) {
			Session session = sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			Subject subject = (Subject) session.get(Subject.class, id);
			session.save(subject);
			transaction.commit();
			session.close();
			return subject;
		}
		@Override
		public List<Subject> getAllSubjectList() {
			Session session = sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			List<Subject> subjectList = session.createQuery("from com.learner.model.Subject").list();
			transaction.commit();
			session.close();
			return subjectList;
		}
		@Override
		public void removeSubject(int id) {
			Session session = sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			Subject s = new Subject();
			s.setSubjectId(id);
			session.delete(s);
			transaction.commit();
			session.close();
		}
		@Override
		public Subject updateSubject(Subject subject) {
			Session session = sessionUtil.getSession();
			Transaction transaction = session.beginTransaction();
			session.update(subject);
			transaction.commit();
			session.close();
			return subject;
		}
		@Override
		public List<Subject> updateSubject(Teacher teacher) {
			Session session = sessionUtil.getSession();
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
		}

	}


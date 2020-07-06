package com.learner.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Classes{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classId;
	private String className;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classes", cascade = CascadeType.ALL)
	private List<Subject> subjectList = new ArrayList<Subject>();
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classes", cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<Student>();
	public Classes() {
		// TODO Auto-generated constructor stub
	}
	
	public int getClassId() {
		return classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}


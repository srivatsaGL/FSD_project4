package com.learner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table
@DynamicUpdate
public class Subject{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	@Column(nullable = true)
	private String subjectName;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "classId")	
	private Classes classes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
	
	public Subject() {
		// Default constructor for Subject class
		
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}

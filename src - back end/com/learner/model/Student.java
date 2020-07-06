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
public class Student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId", updatable = false, nullable = true)
	private int studentId;
	@Column(nullable = true)
	private String studentName;
	
	private String studentCourse;
	private long studentPhone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "classId")	
	private Classes classes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
	public Student() {
		// Default constructor for Student class
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
}

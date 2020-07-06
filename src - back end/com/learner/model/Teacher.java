package com.learner.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	@Column(nullable = true)
	private String name;
	private String address;
	private long contact;
	private String specialized;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher", cascade = CascadeType.ALL)
	private List<Subject> subjectList = new ArrayList<Subject>();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher", cascade = CascadeType.ALL)
	private List<Student> studentList = new ArrayList<Student>();

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public long getContact() {
		return contact;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentList;
	}

}

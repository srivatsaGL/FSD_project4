package com.learner.controller;

public class DemoMain {

	public static void main(String[] args) {
		ClassesController control = new ClassesController();
		SubjectController sub = new SubjectController();
		StudentController stu =new StudentController();
		TeacherController Tea= new TeacherController();
		System.out.println(control.getAllClasses()+"\n");
		System.out.println(sub.getSubjectById(1));

	}

}

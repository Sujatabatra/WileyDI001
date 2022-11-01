package com.jasmine.demo;

import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
		Student student=new Student();
		student.inputStudentDetails(101, "AAAA");
		student.displayStudent();
		
		System.out.println("=================");
		
		Marks marks=new Marks();
		marks.inputStudentWithMarks(111, "XYZ", 66, 89, 56);
		marks.displayStudentWithyMarks();

	}

}

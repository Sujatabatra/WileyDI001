package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
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

		System.out.println("=====================");
		
		Grade grade=new Grade();
		grade.inputStudentWithMarks(222, "ABC", 89, 56, 45);
		grade.displayAllDetails();
		
		System.out.println("=========================");
		
		Sports sports=new Sports();
		sports.inputStudentWithSportsInfo(234, "QWERTY", "Football");
		sports.displayStudentWithSportsInfo();
	}

}

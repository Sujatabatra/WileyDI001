package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
				
		Student student=new Student();
		student.input(111, "XYZ");
		student.displayStudentDetails();
		
		Grade grade=new Grade();
		grade.input(222, "ABC", 89, 56, 45);
		grade.displayStudentDetails();
		
		
	}

}

package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Sports;
import com.sujata.demo.Student;

public class MainClass {

	public static void main(String[] args) {
				
		Grade grade=new Grade();
		grade.inputStudentWithMarks(222, "ABC", 89, 56, 45);
		grade.displayAllDetails();
		
		
	}

}

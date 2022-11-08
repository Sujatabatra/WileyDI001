package com.sujata.setsdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode  //whenever we want to store unique object
public class Employee {

	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double salary;
}

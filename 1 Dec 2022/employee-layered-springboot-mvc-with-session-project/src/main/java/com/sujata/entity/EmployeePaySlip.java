package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePaySlip {

	private Employee employee;
	private double allowanceA;
	private double allowanceB;
	private double deduction;
	private double totalSalary;
	
}

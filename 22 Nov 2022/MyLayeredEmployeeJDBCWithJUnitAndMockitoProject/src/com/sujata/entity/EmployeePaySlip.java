package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EmployeePaySlip {

	private Employee employee;
	private double allowanceA;
	private double allowanceB;
	private double deduction;
	private double totalSalary;
	
}

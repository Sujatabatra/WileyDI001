package com.sujata.entity;

import java.time.LocalDate;

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
public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private String empDepartment;
	private double empSalary;
	private LocalDate dateOfJoining;
}

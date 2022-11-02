package com.sujata.demo;

import java.util.Scanner;

public class HetrogeneousPersonMain {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total No of Persons ");
		int total=scanner.nextInt();
		
		PersonList personList;
		personList=new PersonList(total);
		
		for(int index=0;index<total;index++) {
			Person p;
			System.out.println("Enter emp for employee and ent for enterpreneur");
			String choice=scanner.next();
			if(choice.equals("emp")) {
				System.out.println("Enter Employee ID ");
				int eId=scanner.nextInt();
				System.out.println("Enter Employee Name : ");
				String eNa=scanner.next();
				System.out.println("Enter Employee Age");
				int eAge=scanner.nextInt();
				System.out.println("Enter Employee Designation : ");
				String des=scanner.next();
				System.out.println("Enter Employee Department : ");
				String deptt=scanner.next();
				System.out.println("Enter Employee Salary : ");
				double sal=scanner.nextDouble();
				p=new Employee(eId, eNa, eAge, des, deptt, sal);
			}
			else {
				System.out.println("Enter Enterpreneur ID ");
				int id=scanner.nextInt();
				System.out.println("Enter Enterpreneur Name : ");
				String na=scanner.next();
				System.out.println("Enter Enterpreneur Age");
				int age=scanner.nextInt();
				System.out.println("Enter Nature Of Bussiness : ");
				String bs=scanner.next();
				System.out.println("Enter TurnOver : ");
				double to=scanner.nextDouble();
				p=new Enterpreneur(id, na, age, na, to);
			}
				
			personList.inputPerson(p, index);
			
		}

		personList.displayPersonList();
	}

}

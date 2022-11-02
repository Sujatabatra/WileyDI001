package com.sujata.demo;

import java.util.Scanner;

public class PersonListMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total No of Persons ");
		int total=scanner.nextInt();
		
		PersonList personList;
		personList=new PersonList(total);
		
		for(int index=0;index<total;index++) {
			Person person=new Person();
			System.out.println("Enter "+(index+1)+"person Id : ");
			person.setId(scanner.nextInt());
			System.out.println("Enter "+(index+1)+"person Name : ");
			person.setName(scanner.next());
			System.out.println("Enter "+(index+1)+"person Age : ");
			person.setAge(scanner.nextInt());
			
			personList.inputPerson(person, index);
			
		}
		
		personList.displayPersonList();

	}

}

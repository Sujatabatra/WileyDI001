package com.sujata.demo;

public class PersonList {

	private Person[] persons;
	private int totalNoOfPersons;
	
	public PersonList(int totalNoOfPersons) {
//		super();
		this.totalNoOfPersons = totalNoOfPersons;
		persons=new Person[totalNoOfPersons];
	}
	
	public void inputPerson(Person person,int index) {
		persons[index]=person;
	}
	
	public void displayPersonList() {
		for(int index=0;index<totalNoOfPersons;index++) {
			System.out.println(persons[index].getId()+" "+persons[index].getName()+" "+persons[index].getAge());
		}
	}
	
}

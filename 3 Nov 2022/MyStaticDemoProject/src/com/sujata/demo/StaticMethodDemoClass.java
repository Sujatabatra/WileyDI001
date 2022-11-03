package com.sujata.demo;

class StaticMethodDemo{
	int i;
	private static int j;
	public int getI() {
//		j=10;
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public static int getJ() {
//		i=10;
		return j;
	}
	public static void setJ(int j) {
		StaticMethodDemo.j = j;
	}
	
	
	
}
public class StaticMethodDemoClass {

	public static void main(String[] args) {
		System.out.println(StaticMethodDemo.getJ());
		StaticMethodDemo.setJ(90);;
		System.out.println(StaticMethodDemo.getJ());
		
		StaticMethodDemo obj1=new StaticMethodDemo();
		System.out.println(obj1.getJ());
		
		StaticMethodDemo obj2=new StaticMethodDemo();
		obj2.setJ(obj2.getJ()+5);
		System.out.println(obj1.getJ());
		

	}

}

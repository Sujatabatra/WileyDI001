package com.sujata.demo;

class FirstOuter{
	
	int value;
	
	public void inputValue(int value) {
		this.value=value;
	}
	
	public void displayValue() {
		System.out.println("Value : "+value);
//		System.out.println("Number : "+number);
	}
	
	/*Inner Class
	 * Inner classes can be private, default, protected and public
	 * where Outer classes can be only public or default
	 * 
	 */
	class FirstInner{
		int number;
		public void inputNumber(int number) {
			this.number=number;
		}
		
		public void displayNumber() {
			System.out.println("Number : "+number);
			System.out.println("Value :"+value);
		}
	}
	
	
}
public class FirstInnerClassDemo {

	public static void main(String[] args) {
		FirstOuter firstOuterObj=new FirstOuter();
		firstOuterObj.inputValue(78);
		FirstOuter.FirstInner firstInnerObj=firstOuterObj.new FirstInner();
		
		firstInnerObj.inputNumber(6);
		firstInnerObj.displayNumber();

	}

}

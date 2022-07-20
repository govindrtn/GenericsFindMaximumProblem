package com.bridgelabz.com;

public class TestMaximum {
	
	public static void main(String[] args) {
		
		Integer num1 = 4; 
		Integer num2 = 5; 
		Integer num3 = 9;
		Integer result = TextMaximum(num1,num2,num3);
		
		System.out.println(result);
		
	}
	public static Integer TextMaximum(Integer number1, Integer number2 , Integer number3) {
		
		Integer maxNumber = number1;
		
		if (number2.compareTo(maxNumber)>0) {
			
			 maxNumber = number2;
		}
		if (number3.compareTo(maxNumber)>0) {
			maxNumber = number3;
		}
		return maxNumber;
	}

}

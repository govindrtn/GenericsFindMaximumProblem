package com.bridgelabz.com;

public class TestMaximum {
	
	public static void main(String[] args) {
		
		Integer num1 = 4; 
		Integer num2 = 5; 
		Integer num3 = 9;
		Integer result = TextMaximum(num1,num2,num3);
		
		System.out.println(result);
		
	}
	public static Integer TextMaximum(Integer n1, Integer n2 , Integer n3) {
		
		Integer maxNumber = n1;
		
		if (n2.compareTo(maxNumber)>0) {
			
			 maxNumber = n2;
		}
		if (n3.compareTo(maxNumber)>0) {
			maxNumber = n3;
		}
		return maxNumber;
	}

}

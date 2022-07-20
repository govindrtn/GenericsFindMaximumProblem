package com.bridgelabz.com;

public class TestMaximum {
	
	public static void main(String[] args) {
		
		Float num1 = 4.4F; 
		Float num2 = 5.5F; 
		Float num3 = 9.9F;
		Float result = TextMaximum(num1,num2,num3);
		System.out.println(result);
		
	}
	public static Float TextMaximum(Float number1, Float number2 , Float number3) 
	{
		Float maxNumber = number1;
		
		if (number2.compareTo(maxNumber)>0)
		{	
			 maxNumber = number2;
		}
		if (number3.compareTo(maxNumber)>0)
		{
			maxNumber = number3;
		}
		return maxNumber;
	}
}

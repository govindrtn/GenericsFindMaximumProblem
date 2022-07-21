package com.bridgelabz.com;

public class TestMaximum {
	
	public static void main(String[] args) {
		
		Integer num1 = 4; 
		Integer num2 = 5; 
		Integer num3 = 9;
		
		Float number1 = 4.4F; 
		Float number2 = 5.5F; 
		Float number3 = 9.9F;
		
		String name1 = "Sachin Chouksey"; 
		String name2 = "Anil kumar"; 
		String name3 = "Karan kumar";
		
		Integer maxIntger = TextMaximum(num1, num2, num3);
		Float maxFloat = TextMaximum(number1, number2, number3);
		String result = TextMaximum(name1, name2, name3);
		
		System.out.println("Max Integer is ---> " + maxIntger );
		System.out.println("Max Float is ---> " + maxFloat);
		System.out.println("Max String is ---> " + result);
		
	}
	public static <T extends Comparable <T>> T TextMaximum(T n1, T n2 , T n3) 
	{
		T maximum = n1;
		
		if (n2.compareTo(maximum)>0)
		{	
			maximum = n2;
		}
		if (n3.compareTo(maximum)>0)
		{
			maximum = n3;
		}
		return maximum;
	}
}

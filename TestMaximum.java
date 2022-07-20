package com.bridgelabz.com;

public class TestMaximum {
	
	public static void main(String[] args) {
		
		String name1 = "Sachin Chouksey"; 
		String name2 = "Anil kumar"; 
		String name3 = "Karan kumar";
		String result = TextMaximum(name1,name2,name3);
		System.out.println("Max String is ---> " + result);
		
	}
	public static String TextMaximum(String name1, String name2 , String name3) 
	{
		String maxString = name1;
		
		if (name2.compareTo(maxString)>0)
		{	
			maxString = name2;
		}
		if (name3.compareTo(maxString)>0)
		{
			maxString = name3;
		}
		return maxString;
	}
}

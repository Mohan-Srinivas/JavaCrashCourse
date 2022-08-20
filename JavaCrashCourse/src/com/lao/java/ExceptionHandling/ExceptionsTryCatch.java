package com.lao.java.ExceptionHandling;

public class ExceptionsTryCatch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int number1=2;
			int number2=0;
			int number3=number1/number2;
			System.out.println(number3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Take a lemon Juice!! any number can not be divided by zero");
		}
	}

}

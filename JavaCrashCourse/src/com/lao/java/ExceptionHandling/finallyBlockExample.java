package com.lao.java.ExceptionHandling;

public class finallyBlockExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int number1=2;
			int number2=0;
			System.out.println("Try block");
			System.exit(0);
			int number3=number1/number2;
			
			System.out.println(number3);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Null pointer Exception");
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(" / by zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Take a lemon Juice!! any number can not be divided by zero");
		}
		finally
		{
			System.out.println("Finally block");
		}


	}

}

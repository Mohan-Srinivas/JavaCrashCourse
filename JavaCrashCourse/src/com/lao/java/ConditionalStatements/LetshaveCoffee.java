package com.lao.java.ConditionalStatements;

public class LetshaveCoffee
{
	boolean isCupEmpty=true;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LetshaveCoffee coffee=new LetshaveCoffee();
		if(coffee.isCupEmpty)
		{
			System.out.println("You need to fill the coffee");
		}
		else
		{
			System.out.println("You have the coffee");
		}
	}

}

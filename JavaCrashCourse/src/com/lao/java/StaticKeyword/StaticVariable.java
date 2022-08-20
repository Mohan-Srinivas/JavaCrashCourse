package com.lao.java.StaticKeyword;

public class StaticVariable 
{
	static int money=0;
	String name;
	public static void main(String[] args)
	{
		StaticVariable staticVariable=new StaticVariable();
		staticVariable.money=2000;
		staticVariable.name="Srini";
		
		
		StaticVariable staticVariable1=new StaticVariable();
		staticVariable1.money=3000;
		staticVariable1.name="Kodi";
		
		System.out.println("Amount deposited "+staticVariable.money);
		System.out.println("Amount deposited by "+staticVariable.name);
		System.out.println("Amount deposited "+staticVariable1.money);
		System.out.println("Amount deposited by "+staticVariable1.name);

	}

}

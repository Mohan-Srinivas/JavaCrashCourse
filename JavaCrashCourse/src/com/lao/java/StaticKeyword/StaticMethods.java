package com.lao.java.StaticKeyword;

public class StaticMethods 
{
	static void method1()
	{
		System.out.println("static method1");
	}
	void method2()
	{
		StaticMethods.method1(); // We can call static method from a non static method
		System.out.println("Method Non Static");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticMethods.method1();
		StaticMethods methods=new StaticMethods();
		methods.method2();
	}

}

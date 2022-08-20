package com.lao.java.Constructor;

public class ChildClassConstructor extends ParentClassConstructor
{
	public ChildClassConstructor()
	{
		super();
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChildClassConstructor childClass=new ChildClassConstructor();
	}

}

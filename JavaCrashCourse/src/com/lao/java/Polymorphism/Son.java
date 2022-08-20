package com.lao.java.Polymorphism;

public class Son extends Parents
{
	public String marriage()
	{
		System.out.println("My Marraige! My Rules");
		return null;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Parents parent=new Son();  //ParentClass ref=new ChildClass();
		parent.properties();
		parent.marriage();
	}

}

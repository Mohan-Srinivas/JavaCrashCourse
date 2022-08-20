package com.lao.java.Polymorphism;

public class OverLoading
{
	public void add()
	{
		int a=3;
		int b=2;
		System.out.println("Addition value is "+(a+b));
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverLoading loading=new OverLoading();
		loading.add();
		loading.add(5, 60);
		int c=loading.add(5, 6, 8);
		System.out.println("Addition value is "+c);
	}

}

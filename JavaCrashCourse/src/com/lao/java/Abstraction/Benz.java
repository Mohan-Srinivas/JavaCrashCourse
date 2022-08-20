package com.lao.java.Abstraction;

public class Benz extends Car implements UpcomingProjectsInterface,Interface2
{
	public void engineSecret()
	{
		System.out.println("Benz Engine Secret");
	}
	public void companyVault()
	{
		System.out.println("Benz Company's vault");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car=new Benz();
		car.engineSecret();
		car.companyVault();
		Benz benz=new Benz();
		benz.get();
		benz.put();
		benz.get2();
	}
	@Override
	public void get() 
	{
		// TODO Auto-generated method stub
		System.out.println("Get method");
	}
	@Override
	public void put()
	{
		// TODO Auto-generated method stub
		System.out.println("Put method");
	}
	@Override
	public void get2() 
	{
		// TODO Auto-generated method stub
		System.out.println("Get2 method");
	}

}

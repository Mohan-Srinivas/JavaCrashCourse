package com.lao.java.Abstraction;

public class Bmw extends Car
{
	public void engineSecret()
	{
		System.out.println("BMW Engine Secret");
	}
	public void companyVault()
	{
		System.out.println("BMW Company's vault");
	}
	public static void main(String[] args)
	{
		Car car=new Bmw();
		car.engineSecret();
		car.companyVault();
	}
}

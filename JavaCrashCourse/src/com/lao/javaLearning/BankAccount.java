package com.lao.javaLearning;

public class BankAccount 
{
	Long accountNumber=1234567890l;
	String accHolderName="Srinivasan";
	Integer accountBalance=690;
	void getBalance()
	{
		System.out.println("The balance amount is "+accountBalance);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.getBalance();
		
	}

}

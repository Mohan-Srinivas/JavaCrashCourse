//Example for Return Types

package com.lao.javaLearning;

public class CollectAmout 
{
	Integer collectAmount=1000;
	public Integer getAmoutAndGiveItToMe()
	{
		System.out.println("Daddy!! I have collected the Amount "+collectAmount);
		return collectAmount;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CollectAmout mySon=new CollectAmout();
		Integer collectedAmount=mySon.getAmoutAndGiveItToMe();
		System.out.println(collectedAmount);

	}

}

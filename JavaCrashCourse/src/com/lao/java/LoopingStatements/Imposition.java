package com.lao.java.LoopingStatements;

public class Imposition 
{
	/*
		You : I'm not sure! May be this programming not for me
		Trainer : What are u saying? You are doing great
		You : I don't Think so
		Trainer : You don't believe! Ok Write an imposition
				  "I can Program! I can Learn" for 25 Times
		You : :(
	
	*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//For loop 1. Initialization; 2.Condition; 3.Increment/decrement
		/*
		 * for(int times=0;times<25;times++) {
		 * System.out.println("I Can Program! I can Learn "); }
		 */
		/*
		 * int times=0; while(times<25) {
		 * System.out.println("I Can Program! I can Learn"); times++; }
		 */
		int times=0;
		int count=0;
		do
		{
			System.out.println("I Can Program! I can Learn");
			times++;
			count++;
			
		}while(times<25);
		System.out.println(count);
	}
	

}

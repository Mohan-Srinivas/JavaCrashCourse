package com.lao.java.ConditionalStatements;

public class WhosTheHero 
{
	
	String myHeroName="Hulk";
	public void superHeroGuesser()
	{
		if(myHeroName.equalsIgnoreCase("Iron Man"))
		{
			System.out.println("Your thought about Iron Man");
		}
		else if(myHeroName.equalsIgnoreCase("Captain America"))
		{
			System.out.println("Your thought about Captain America");
		}
		else if(myHeroName.equalsIgnoreCase("Thor"))
		{
			System.out.println("Your thought about Thor");
		}
		else
		{
			System.out.println("Sorry!! I can't guess");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WhosTheHero hero=new WhosTheHero();
		hero.superHeroGuesser();
	}

}

package com.lao.java.ConditionalStatements;

public class SuperHeroOrNot 
{
	String superHero="Captain America";
	public void heroOrNot()
	{
		switch (superHero) 
		{
			case "Captain America":
					System.out.println("Captain America is SuperHero");
					break;
			case "BatMan":
					System.out.println("BatMan is SuperHero" );
					break;
			case "SuperMan":
					System.out.println("SuperMan is SuperHero" );
					break;
			case "SpiderMan":
					System.out.println("SpiderMan is SuperHero" );
					break;
			default:
					System.out.println(superHero+ " Sorry!! i dont know about this person" );
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperHeroOrNot heroOrNot=new SuperHeroOrNot();
		heroOrNot.heroOrNot();
	}

}

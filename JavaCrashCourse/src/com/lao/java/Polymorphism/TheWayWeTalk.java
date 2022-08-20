package com.lao.java.Polymorphism;

public class TheWayWeTalk 
{
	public void talk(Parents styleoftalking)
	{
		System.out.println("Polite,,,Respectful???");
	}
	public void talk(Boss styleoftalking)
	{
		System.out.println("Nothing Personal,Strictly business");
	}
	public void talk(Partner styleoftalking)
	{
		System.out.println("Love,,Romantic,,Mixture of everything love");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TheWayWeTalk weTalk=new TheWayWeTalk();

		Parents parents=new Parents();
		weTalk.talk(parents);

		Boss boss=new Boss();
		weTalk.talk(boss);

		Partner partner=new Partner();
		weTalk.talk(partner);
	}

}

package com.lao.java.Strings;

public class StringBuilderExamples 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("String is Immutable");
		String name="Raina";
		System.out.println("Appending a string to name "+name.concat(" Suresh"));
		System.out.println(name);
		System.out.println("**************************************");
		System.out.println("StringBuilder is Mutable");
		StringBuilder name1=new StringBuilder("Suresh");
		System.out.println("Appending string to StringBuilder "+name1.append(" Kumar Raina"));
		System.out.println(name1);
	
	
		//StringBuilder methods
		//Reverse
		System.out.println(name1.reverse());
		
		//Replace
		StringBuilder replaceThis=new StringBuilder("Srini");
		System.out.println(replaceThis.replace(0, 4, "Vasan"));
		
		//Delete
		StringBuilder deleteThis=new StringBuilder("NoKohli");
		System.out.println(deleteThis.delete(0, 2));
		
		//Insert
		StringBuilder insertThis=new StringBuilder("Suresh");
		System.out.println(insertThis.insert(6, " Raina"));
		//Capaciy
		System.out.println(insertThis.capacity());
	
	}

}

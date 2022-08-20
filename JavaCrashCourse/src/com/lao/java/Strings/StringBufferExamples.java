package com.lao.java.Strings;

public class StringBufferExamples 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("String is Immutable");
		String name="Raina";
		System.out.println("Appending a string to name "+name.concat(" Suresh"));
		System.out.println(name);
		System.out.println("**************************************");
		System.out.println("StringBuffer is Mutable");
		StringBuffer name1=new StringBuffer("Suresh");
		System.out.println("Appending string to StringBuffer "+name1.append(" Kumar Raina"));
		System.out.println(name1);
	
	
		//StringBuffer methods
		//Reverse
		System.out.println(name1.reverse());
		
		//Replace
		StringBuffer replaceThis=new StringBuffer("Srini");
		System.out.println(replaceThis.replace(0, 4, "Vasan"));
		
		//Delete
		StringBuffer deleteThis=new StringBuffer("NoKohli");
		System.out.println(deleteThis.delete(0, 2));
		
		//Insert
		StringBuffer insertThis=new StringBuffer("Suresh");
		System.out.println(insertThis.insert(6, " Raina"));
		//Capaciy
		System.out.println(insertThis.capacity());
	
	}

}

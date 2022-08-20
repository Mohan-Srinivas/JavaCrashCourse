package com.lao.java.Strings;

public class StringExample
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name="Srinivasan";
		
		//Returns the character value for the Particular index
		System.out.println(name.charAt(1));
		
		//Returns length of the string
		System.out.println("Length of the String "+name.length());
		
		//Checks the equality of the string with the given object
		System.out.println(name.equals("Kodi"));
		
		//Checks the equality of the string with the given object without case sensitivity
		System.out.println(name.equalsIgnoreCase("SRINIVASAN"));
		
		//Checks if the given string is empty or not
		System.out.println(name.isEmpty());
		
		//Returns true/false based on the given value is present or not
		System.out.println(name.contains("r"));
		
		//Take a particular portion of a string
		System.out.println(name.substring(5));
		
		//Take a particular portion of a string begin and end index
		System.out.println(name.substring(0,5));
		
		//Appends a string to the given String
		System.out.println(name.concat(" Mohan"));
		
		//Replaces existing character with given character
		System.out.println(name.replace("i", "s"));
		
		//Finds the position of a character in the string
		System.out.println(name.indexOf("v"));
		//Finds the character specified from the index position 
		System.out.println(name.indexOf("a", 7));
		
		//Finds the character specified from the index position
		System.out.println(name.indexOf("a", 5));
		
		//Trim will remove the whitespaces before and after
		String trimStr="  Srini  ";
		System.out.println(trimStr.trim());
		
		//Convert given data type to String
		int number=48;
		System.out.println(String.valueOf(number));
		
		//Convert Given String into Uppercase and LowerCase
		String UpperCase="KODI";
		System.out.println(UpperCase.toLowerCase());
		String Lower="raina";
		System.out.println(Lower.toUpperCase());
		
		//Returns a joined string with Given Delimiter
		System.out.println(String.join("/", "19","04","2022"));
		System.out.println(String.join(".", "B","C","A"));
		
		// Spilt
		String splitThis="do,you,understand,what,i'm,telling?";
		String[] splited=splitThis.split(",");
		for (String string : splited) 
		{
			System.out.println(string);			
		}
		StringBuffer s=new StringBuffer(name);
		s.reverse();
		

	
	}

}

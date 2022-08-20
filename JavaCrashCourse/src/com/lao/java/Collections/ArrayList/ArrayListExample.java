package com.lao.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample 
{
	public void arrayListExample()
	{
		//Creating a new ArrayList
		List<String> arrayList=new ArrayList<String>();

		//Adding Element to an ArrayList
		arrayList.add("Range Rover");
		arrayList.add("Jaquar");
		arrayList.add("BMW");
		arrayList.add("Benz");
		arrayList.add(null);
		

		//Adding Elements to particular index
		arrayList.add(0,"Honda");

		// you can Add null values as well
		arrayList.add(null);

		System.out.println("ArrayList values are :"+arrayList);

		// To get an element from a particular position
		System.out.println("get the Element by position: "+arrayList.get(1));

		//List Allows us to add duplicate values as well
		arrayList.add("BMW");


		System.out.println("ArrayList values are :"+arrayList);

		//To get the position of the Particular Element
		//indexOf() always returns the 1st occurence 
		System.out.println(arrayList.indexOf("BMW"));

		//To get the position of the Particular Element(last position)
		System.out.println(arrayList.lastIndexOf("BMW"));

		//If indexOf() returned -1 means,mentioned values is not present in ArrayList
		System.out.println(arrayList.indexOf("Tata"));

		//Add a list to Another List
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println("Another List values are :"+anotherList);
		System.out.println("Removed Values is :"+anotherList.remove(6));
		
		//Remover using Value
		System.out.println("Removed Values is :"+anotherList.remove("Honda"));
		System.out.println("Another List values are :"+anotherList);
		
		//To delete all the elemnets from a list
		anotherList.clear();
		System.out.println("After clearing :"+anotherList);
		anotherList.addAll(0, arrayList);
		System.out.println("Another List values are :"+anotherList);
		anotherList.clear();
		//Check whether the list is empty or not
		System.out.println("IsEmpty or not : "+anotherList.isEmpty());
		
		// Ways to Iterate a ArrayList
		/* 1. ForEach loop
		 * 2. For loop
		 * 3. ListIterator interface(We can perform forward traverse and reverse traverse as well)
		 * 4. Iterator Interface
		 */
		arrayList.remove(null);
		arrayList.remove("BMW");
		
		System.out.println("ArrayList values are :"+arrayList);
		//1. Using Foreach Loop
	//	System.out.println("Using Foreach Loop");
		for (String string : arrayList)
		{	
			System.out.println("Using Foreach Loop : "+string);
			
		}
		System.out.println("-----------------------------------");
	//	System.out.println("Using For Loop");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println("Using For Loop : "+arrayList.get(i));
		}
		System.out.println("-----------------------------------");
	//	System.out.println("Using ListIterator (Forward Direction");
		ListIterator<String> listIterator=arrayList.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println("Using ListIterator (Forward Direction) : "+listIterator.next());
		}
	//	System.out.println("Using ListIterator (Reverse Direction)");
		while(listIterator.hasPrevious())
		{
			System.out.println("Using ListIterator (Reverse Direction) : "+listIterator.previous());
		}
		System.out.println("-----------------------------------");
	//	System.out.println("Using Iterator Loop");
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Using Iterator Loop : "+iterator.next());
			//arrayList.add("Civic");
		}
		

		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayListExample example= new ArrayListExample();
		example.arrayListExample();

	}

}
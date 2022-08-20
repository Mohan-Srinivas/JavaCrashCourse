package com.lao.java.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample
{
	/*
	 * Set(I) -> HashSet(C) and LinkedHashSet(C) are implementations
	 * Set(I) -> SortedSet(Child Interface) --> NavigableSet(I) =>TreeSet is
	 * the implementation
	 * 
	 * Important points to remember
	 * 1. To store group of individual objects
	 * 2. Duplicates not allowed
	 * 3. Insertion order will not be maintained
	 * 4. Set(I) doesn't have any new methods other than given in Collection(I) 
	 * 5. DS for HashSet(C) is Hash Table
	 * 6. If we add duplicate values to HashSet,simply it will return false to 
	 * 	  the add() and it won't throw any error or exception
	 * 7. We can insert null values
	 * 8. Heterogeneous values can be added when Generic wasn't provided.
	 * 9. Implements Serializable and Cloneable? --> Yes
	 * 10.Data are stored based on hashcode,so search is very effective
	 * 11.Fill ratio or Load factor : 0.75 or 75%
	 * 12."Default Capacity : 16 "
	 */
	
	/*	Number of Constructors Available in HashSet=
	 * 
		HashSet<String> hs=new HashSet<String>(); size=16,fill ratio is 0.75
		HashSet<String> hs1=new HashSet<String>(int initialCapacity); Size as declared,fill ratio is 0.75(deafult)
		HashSet<String> hs2=new HashSet<String>(int initialCapacity,float fillratio); Size and fill ratio as declared
		HashSet<String> hs2=new HashSet<String>(Collection c); Creates a Hashset for any given collection.Acts as a Interconversion

	 */
	public void basicExamplesHashSet()
	{
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		System.out.println(hashSet.add("A")); // the return type of add() is boolean.Since A is already present it will return false 
		hashSet.add(null);
		hashSet.add("G");
		//Insertion order will not be maintained and we don't have an control on that
		
		System.out.println("Contents of the HashSet :"+hashSet);
		hashSet.remove(null);
		System.out.println("Contents of the HashSet :"+hashSet);
		System.out.println(hashSet.contains("A"));
		System.out.println(hashSet.isEmpty());
		
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(hashSet);
		System.out.println("Contents of the New HashSet :"+hs);
		
		System.out.println(hashSet.containsAll(hs));
		
	}
	public void iterateusingIterator()
	{
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");
		hashSet.add("F");
		hashSet.add("F");
		Iterator<String> iterator=hashSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Contents of the HashSet : "+iterator.next());
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSetExample example=new HashSetExample();
		example.basicExamplesHashSet();
		example.iterateusingIterator();
	}

}

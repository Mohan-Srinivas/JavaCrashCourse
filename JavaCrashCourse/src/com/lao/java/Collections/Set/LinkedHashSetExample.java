package com.lao.java.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	/*
	 * LinkedHashSet --> Child class of HashSet
	 * Data Structures --> Hash Table + LinkedList
	 * Insertion order is preserved
	 * Duplicates not allowed
	 * 
	 */
	public void linkedHashSetExample()
	{
		LinkedHashSet linkedHashSet=new LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add(10);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add(10);
		linkedHashSet.add(null);
		linkedHashSet.add("D");
		
		System.out.println("Contents of Linked HashSet :"+linkedHashSet);
		//System.out.println(linkedHashSet.remove(10));
		System.out.println("Size : "+linkedHashSet.size());
		System.out.println("Contents of Linked HashSet :"+linkedHashSet);
		
		System.out.println(linkedHashSet.contains("A"));
		LinkedHashSet linkedHashSet1=new LinkedHashSet();
		linkedHashSet1.addAll(linkedHashSet);
		System.out.println("Contents of New Linked HashSet :"+linkedHashSet1);
		
	}
	public void IteratorLinkedHashSet()
	{
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("D");
		
		Iterator<String> iterator=linkedHashSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Contents of LinkedHash Set : "+iterator.next());
		}
		
	}
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedHashSetExample example=new LinkedHashSetExample();
		example.linkedHashSetExample();
		//example.IteratorLinkedHashSet();
	}

}

package com.lao.java.Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample 
{
	/*
	 *
	 *  1. TreeSet(C) is an implementation class for SortedSet(I) and  NavigableSet(I)
		2. Duplicates values are not allowed
		3. Sorts the Elements
		4. It has 6 methods like first,last,headSet,tailSet,subSet and Comparator
		5. Difference between HashSet and TreeSet,HashSet doesn't maintain 
		   order but TreeSet maintains Ascending or Alphabetical order
		6. DS --> Balanced tree
		7. Heterogeneous objects are not allowed.If Added ClassCastException will occur
		8. For default natural sort order,the objects should be homogeneous 
		   and comparable else class cast Exception will occur
		9. To say any class is comparable or not,the class should implement
		   comparable interface

	 * 
	 */
	
	/* Constructors present in TreeSet are 4
	 * 
	 * TreeSet ts=new TreeSet(); //default sort order
	 * TreeSet ts=new TreeSet(Comparator c);//Customised sorting order defined by Comparator
	 * TreeSet tv=new TreeSet(Collection C);//Equivalent tree set of any collection will be created
	 * TreeSet ts=new TreeSet(SortedSet S);//Creates a tree set for given sortedSet
	 */
	public void treeSetExample()
	{
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(2);

		System.out.println("The Elements is the TreeSet are "+treeSet);
		
		//first()
		System.out.println("First elements is "+treeSet.first());
		
		//last()
		System.out.println("Last elements is "+treeSet.last());
		
		//headSet()
		System.out.println("Values lesser than the given value " +treeSet.headSet(8));
		
		//tailSet()
		System.out.println("Values equal or higher than the given value "+treeSet.tailSet(2));
		
		//Subset()
		System.out.println("Subset values "+treeSet.subSet(1, 10));
		
		//Comparator()
		System.out.println("Returns null if the sorting order is default sorting order "+treeSet.comparator());
		
		//Size()
		System.out.println("Size is "+treeSet.size());
		
		//Contains()
		System.out.println(treeSet.contains(10));
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.addAll(treeSet);
		System.out.println("The new tree set are "+ts1);
		
		/*
		 * Adding null to a non-empty tree set causes null pointer exception
		 * treeSet.add(null);
		 * null can be easily added if the tree set is empty (until 1.6)
		 * If there are any elements present Comparator will check for the
		 * sorting order between the previously added element and the null.
		 * Same is the case,if we add null first and add other elements,NPE
		 * (null pointer exception) will happen  
		 */
		//compareAll
		System.out.println("Compare of two Tree set "+treeSet.containsAll(ts1));
		
		//Higher()
		System.out.println("next immediate higher value is : "+treeSet.higher(1));
		
		//Lower()
		System.out.println("Next immediate lower value is : "+treeSet.lower(2));
	
		//poll first
		System.out.println("poll first : "+ts1.pollFirst());
		
		//pollLast()
		System.out.println("poll last : "+ts1.pollLast());
		System.out.println("After Polling :"+ts1);
		//descendingSet()
		System.out.println("Descending order set is "+treeSet.descendingSet());
	
		//normal Iteration
		Iterator<Integer> iterator=treeSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println("TreeSet values is "+iterator.next());
		}
		//Desceneding order
		Iterator<Integer> descIterator=treeSet.descendingIterator();
		while(descIterator.hasNext())
		{
			System.out.println("Descending order : "+descIterator.next());
		}
	
		//Class Cast Exception
		TreeSet<StringBuffer> set=new TreeSet<StringBuffer>();
		set.add(new StringBuffer("B"));
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("c"));
		System.out.println(set);
		
		set.containsAll(ts1);
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSetExample example=new TreeSetExample();
		example.treeSetExample();
	}

}

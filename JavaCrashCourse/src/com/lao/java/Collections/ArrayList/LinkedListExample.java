package com.lao.java.Collections.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

/*

 LinkedList is implemented using Doubly linked list.This is best suited 
 for insertion and Deletion unlike ArrayList.But this is not the best
 for retrieving the data.
 All the collections implements Serializable and cloneable interfaces.
 LinkedList also implements those Interfaces but not Random Access Interface
 */
public class LinkedListExample 
{	
	public void linkedListOperations()
	{
		//Create a Simple linked List 
		LinkedList<Integer> linkedList=new LinkedList<Integer>();

		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		linkedList.add(null);
		
		//LinkedList also allow duplicates
		System.out.println("Linked List is :"+linkedList);

		//To Add an Element to a First Position
		linkedList.addFirst(1);
		System.out.println("Afer adding first values: "+linkedList);

		//To Add an Element to a Last Position
		linkedList.addLast(5);
		System.out.println("Afer adding last values: "+linkedList);

		/* 
		 * LinkedList performs the worst if the operation is retrieval of
		 * data.Hence if our requirement is to fetch data,We should use
		 * ArrayList.but LinkedList is the best choice if we have requirements 
		 * of adding and removing data very often.In this case we should
		 * avoid ArrayList
		 */

		//Get the first value
		System.out.println("First value is : "+linkedList.getFirst());

		//Get the First value using index Position
		System.out.println("First value(by position) : "+linkedList.get(0));

		/* Now get the third value of the List
		 * Since LinkedList has the data structure of doubly linked list
		 * the value of the third index known only to the link present in
		 * the second index.Internally the program will traverse to index 
		 * number 2 and then only it can get the value of 3.
		 * So,LinkedList is not suited for search operations 
		 * 
		 */
		System.out.println("Third Value is :"+linkedList.get(3));
		
		//Remove first and last
		System.out.println("Remove first :"+linkedList.removeFirst());
		System.out.println("Remove last :"+linkedList.removeLast());
		
		//Get the Last Value
		System.out.println("Last value is : "+linkedList.getLast());
		
		//Poll() and pollFirst() deletes the firstElement from an list
		System.out.println("Remove using pole() :"+linkedList.poll());
		System.out.println(linkedList);
		
		//pollLast() deletes LastElement from an list
		System.out.println("Remove last Element by pollLast() : "+linkedList.pollLast());
		System.out.println(linkedList);
		
		//remove() deletes the first element
		System.out.println("remove() :"+linkedList.remove());
		System.out.println(linkedList);
		
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(2);
		System.out.println(linkedList);
		
		//Remove first occurrence of specific values
		System.out.println("After removing first occurrence of 2 "+linkedList.removeFirstOccurrence(2)); 
		System.out.println(linkedList);
		
		//Remove last occurrence of Specific values
		System.out.println("After removing last occurrence of 8 "+linkedList.removeLastOccurrence(8));
		System.out.println(linkedList);
		System.out.println("------------------------------------------------------------------------------");
		
	}
	public void iterateLinkedList()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		System.out.println("The Simple for loop");
		for(int i=0;i<linkedList.size();i++)
		{
			System.out.println("Elements in the LinkedList are :"+linkedList.get(i));
		}
		System.out.println("------------------------------------------------------------------------------");

	}
	public void iterateWithAdvancedFor()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		System.out.println("The Advanced for loop");
		for (String string : linkedList) 
		{
			System.out.println("Elements in LL are : "+string);
		}
		System.out.println("------------------------------------------------------------------------------");

	}
	public void iterateWithWhile()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		int number=0;
		System.out.println("The While loop");
		while(linkedList.size()>number) 
		{
			System.out.println("Elements in LL are : "+linkedList.get(number));
			number++;
		}
		System.out.println("------------------------------------------------------------------------------");

	}
	public void iterateWithIterator()
	{
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.add(null);
		
		System.out.println("Using Iterator");
		Iterator<String> iterator=linkedList.iterator();
		while(iterator.hasNext()) 
		{
			System.out.println("Elements in LL are : "+iterator.next());
			
		}
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedListExample example=new LinkedListExample();
	//	example.linkedListOperations();
	//	example.iterateLinkedList();
	//	example.iterateWithAdvancedFor();
	//	example.iterateWithWhile();
		example.iterateWithIterator();
	}

}

package com.lao.java.Collections.Map;

import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "Iniya"); //ENTRY
		hashMap.put(2, "Ezhil");
		hashMap.put(3, "Gopi");
		hashMap.put(3, "Bala");
		System.out.println("Original HashMap is : "+hashMap);
		
		//Add Existing map into other Map
		HashMap<Integer, String> duplicateMap=new HashMap<Integer,String>();
		duplicateMap.putAll(hashMap);
		System.out.println("Duplicate Map : "+duplicateMap);
		
		//Getting Key value alone
		System.out.println("Key values in Hashmap is : "+hashMap.keySet());
		
		//Check whether the specific key present in hashmap or not
		System.out.println("Is Key 1 is present or not : "+hashMap.containsKey(7));
		
		//Check whether the specific value present in Hashmap or not
		System.out.println("Does this map has a value \"Eniya\"? : "+hashMap.containsValue("Iniya"));
		
		//Get the Specific value for a key
		System.out.println("Map value of 1 : "+hashMap.get(1));
		
		// Clone
		System.out.println("Cloned map is"+hashMap.clone());
		
		//Clearing and checks for key,values
		duplicateMap.clear();
		System.out.println("After clearing "+duplicateMap);
		
		//Checks for Empty
		System.out.println("IsEmpty ? :"+duplicateMap.isEmpty());
		
		//Fetch All values 
		System.out.println("All values "+hashMap.entrySet());
	}

}

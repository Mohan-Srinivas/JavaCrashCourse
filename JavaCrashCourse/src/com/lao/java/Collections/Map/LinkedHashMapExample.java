package com.lao.java.Collections.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample 
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, String> SuperHeroes=new LinkedHashMap<String,String>();
		SuperHeroes.put("Iron Man", "Tony Stark");
		SuperHeroes.put("Captain America", "Steve Rogers");
		SuperHeroes.put("Black Widow", "Natasha");
		SuperHeroes.put("Black Panther", "T'challa");
		SuperHeroes.put("Black Panther", "T'chaka");
		SuperHeroes.put(null,"Hulk");
		SuperHeroes.put(null, "Shang-chi");
		
		//System.out.println("Linked hash Map : "+SuperHeroes);
		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Iron Man", "Tony Stark");
		hm.put("Captain America", "Steve Rogers");
		hm.put("Black Widow", "Natasha");
		hm.put("Black Panther", "T'chaka");
		hm.put("Black Panther", "T'challa");
		hm.put(null,"Hulk");
		hm.put(null, "Shang-chi");
		
		String str="New ii";
		str=str.toLowerCase();
		
		char[] a=str.toCharArray();
		int index=3;
		System.out.println(Arrays.copyOf(a, index));
		
		System.out.println("Hash map : "+hm);
		
		//System.out.println("Key values in Hashmap is : "+SuperHeroes.keySet());
		
		
		
		/*
		 * //Check whether the specific key present in hashmap or not
		 * System.out.println("Is Key 1 is present or not : "+SuperHeroes.containsKey(7)
		 * );
		 * 
		 * //Check whether the specific value present in Hashmap or not
		 * System.out.println("Does this map has a value \"Eniya\"? : "+SuperHeroes.
		 * containsValue("Iniya"));
		 * 
		 * //Get the Specific value for a key
		 * System.out.println("Map value of 1 : "+SuperHeroes.get(1));
		 * 
		 * // Clone System.out.println("Cloned map is"+SuperHeroes.clone());
		 * 
		 * //Checks for Empty System.out.println("IsEmpty ? :"+SuperHeroes.isEmpty());
		 * 
		 * //Fetch All values System.out.println("All values "+SuperHeroes.entrySet());
		 * 
		 */		
	}

}

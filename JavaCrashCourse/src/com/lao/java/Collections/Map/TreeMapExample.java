package com.lao.java.Collections.Map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<String, String> places=new TreeMap<String,String>();
		//places.put(null, null);
		places.put("Ponmalai", "Trichy");
		places.put("Palakkarai", "Trichy");
		places.put("SriRangam", "Trichy");
		places.put("Trichy","Trichy");
		places.put("Trichy","TVS Toll"); // If keys are same,the values will be overwrite
		
		System.out.println("Tree map is : "+places);
		
	}

}

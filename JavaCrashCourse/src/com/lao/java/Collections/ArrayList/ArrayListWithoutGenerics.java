package com.lao.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics 
{
	public void listWithoutGenerics()
	{
		List li=new ArrayList();
		li.add(12);
		li.add("Yuvraj");
		System.out.println(li);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayListWithoutGenerics example=new ArrayListWithoutGenerics();
		example.listWithoutGenerics();
	}

}

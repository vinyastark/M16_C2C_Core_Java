package com.cg.generic;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Example4
{
	public static void main(String[] args) {
		Map<Integer,Integer>obj=new HashMap<Integer,Integer>();
		obj.put(1,123);
		obj.put(5, 456);
		System.out.println(obj);
		Set<Entry<Integer,Integer>>obj1=obj.entrySet();
		Iterator<Map.Entry<Integer,Integer>>itr=obj1.iterator();
		while(itr.hasNext())
		{
			Map.Entry e1=itr.next();
			System.out.println(e1.getKey()+" " +e1.getValue());
		}

	}
}

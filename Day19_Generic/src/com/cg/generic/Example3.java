package com.cg.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Suyog");
		list.add("Prit");
		//list.add(30);
		String res= list.get(0);
		System.out.println(res);
		Iterator<String> itr =list.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr);
		 }
		
		
	}

}

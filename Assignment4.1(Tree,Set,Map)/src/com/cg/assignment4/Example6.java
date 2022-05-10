package com.cg.assignment4;

import java.util.*;

public class Example6 {

	public static void main(String[] args) {
		NavigableMap<Integer, String> ss = new TreeMap<Integer,String>();
		ss.put(11, "Ajay");
		ss.put(12, "Vinay");
		System.out.println(ss);
		System.out.println(ss.firstEntry());
		
	

	}
}
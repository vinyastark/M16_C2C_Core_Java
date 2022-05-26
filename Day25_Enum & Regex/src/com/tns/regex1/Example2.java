package com.tns.regex1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("industry");
		Pattern p1 = Pattern.compile("Java");
		Matcher m = p1.matcher("Java Programming is enough to get a job in IT industry");
		while(m.find())
		{
			System.out.printf("Pattern found from : " +m.start() + " to " +(m.end()-1));
		}
		
		System.out.println(" Nothing");
		
	}

}
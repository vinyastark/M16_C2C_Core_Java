package net.jbl.collection1;

import java.util.ArrayList;

public class Example3
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList<>();
		Object clone1;
		a.add("Pratit");
		a.add("Mayuresh");
		a.add(5);
		System.out.println(a);
		clone1=a.clone();
		System.out.println(clone1);
		

	}

}
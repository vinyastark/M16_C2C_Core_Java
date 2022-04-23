package com.svj.exception;

public class Example4 {


	public static void main(String[] args) 
	{
	System.out.println(Example4.myMethod());
	}
    public static int myMethod() {
    	try {
    		int x=35;
    		int y=0;
    		int z=x/y;
    		System.out.println("inside try block");
    		System.exit(0);
    	}
    	catch (Exception exp)
    	{
    		System.out.println (exp);
    	}
    	finally {
    		System.out.println("Java Finally Block");
    		return(0);
    	}
    }
}

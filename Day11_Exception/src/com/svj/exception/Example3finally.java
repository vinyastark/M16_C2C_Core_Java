package com.svj.exception;

public class Example3finally {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int [] myIntArray = new int [] {1,2,3};
		try
		{ 
			print(myIntArray);
			System.out.println("Third Line");
		}
		catch (Exception e)	
		{
			System.out.println("Exception handled" +e);
		}
		finally
		{
		System.out.println("Finally Block");
		}
	
	System.out.println("Welcome to Capgemini");
		}
	private static void print(int[] myIntArray) {
		// TODO Auto-generated method stub
		
	}
	public static void main(int [] arr) {
		System.out.println(arr[3]);
		System.out.println("Fourth Element Successfully dislayed");
	}
}

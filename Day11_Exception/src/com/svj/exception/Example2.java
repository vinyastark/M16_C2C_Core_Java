package com.svj.exception;

public class Example2 {

	public static void main(String[] args) {
	try
	{
		   int x= 10/0;
		   System.out.println(x);

			}
   catch (Exception e)
	{
	   System.out.println("Exception is handled" +e);
		}

}
}
package com.svj.exception;
import java.util.*;
public class Example5 {
	
	public static void main(String[] args)
	 {
	     String[] s = {"abc", "123", null, "xyz"};
	     for (int i = 0; i < 5; i++)
	     {
	         try
	         {
	             int a = s[i].length() + Integer.parseInt(s[i]);    
	         }
	         catch(NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e)
	         {
	        	 System.out.println("Exception handled");
	         }
	     }
	 }

}
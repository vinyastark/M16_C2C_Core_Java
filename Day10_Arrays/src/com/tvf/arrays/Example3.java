package com.tvf.arrays;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
		
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); //n is total no. of elements in array
    int arr [] = new int [n];
    for (int i=0; i<=arr.length; i++)
{ 
	arr [i] = s.nextInt();
}
    for (int i=0; i<=arr.length; i++)
{
	System.out.println(arr[i]);
	s.close();
}
	}

}

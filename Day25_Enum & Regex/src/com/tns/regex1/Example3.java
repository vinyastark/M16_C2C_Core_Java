package com.tns.regex1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		String str="Stars @@*@@* *@@* * *@@* * * *";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}
		S.close();
	}

}

package net.vsgroup.com;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		StringBuilder sb=new StringBuilder(s.nextLine());
		System.out.println(sb.capacity());//16

	}

}
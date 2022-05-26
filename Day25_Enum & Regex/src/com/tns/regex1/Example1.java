package com.tns.regex1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		String pattern = "World Wide Web";
		Scanner S = new Scanner(System.in);
		String Input = S.nextLine();
		boolean result = Pattern.matches(pattern, Input);
		System.out.println(result);
		S.close();
;
	}

}
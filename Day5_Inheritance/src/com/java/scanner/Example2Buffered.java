package com.java.scanner;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2Buffered {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		System.out.println(str);
		

	}

}
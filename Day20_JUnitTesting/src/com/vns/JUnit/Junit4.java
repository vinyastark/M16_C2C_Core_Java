package com.vns.JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class Junit4 
{
	@BeforeAll
	
	static void display()
	{
		System.out.println("Vinay");
	}
	
	/*@Tag("Ajay")
	@Disabled*/
	@Test
	void display1()
	{
		System.out.println("Komal");
	}
}
package com.vns.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Junit3 {
	@Disabled //annotation is use to skip to code block;
	@Test
	void print() 
	{
		int a=1;
		int b=2;
		assertEquals(a, b);
	}
	@Test
	void print1() 
	{
		int a=2;
		int b=2;
		assertEquals(a, b);
	}


}
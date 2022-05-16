package com.vns.JUnit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Junit5 
{
	@Test
	void accept()
	{
		System.setProperty("1", "Vinay");
		Assumptions.assumeTrue("Vinay".equals(System.getProperty("1")));
	}
}
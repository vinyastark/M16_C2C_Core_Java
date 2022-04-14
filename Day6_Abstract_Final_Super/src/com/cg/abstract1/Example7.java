package com.cg.abstract1;

class Venomous
{
	Venomous()
	{
		System.out.println("Venomous-5");
	}
}
class NonVenomous extends Venomous
{
	NonVenomous()
	{
		super();
		System.out.println("NonVenomous-10");
		
	}
}
public class Example7 {

	public static void main(String[] args) {
		NonVenomous v=new NonVenomous();
		
		

	}

}
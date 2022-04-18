package com.cg.polymorphism;

class Android
{
	void display()
	{
		System.out.println("Onelus Nord");
	}
}
class Nokia extends Android
{
	void display()

{
	System.out.println("Nokia Connecting People");
}
}
class Apple extends Android
{ 
	void display()
	{
		System.out.println("Iphone 12 pro max");
	}
}
public class FunctionOverriding {

	public static void main(String[] args) {
		Android a = new Android();
		Nokia a1 = new Nokia();
		Apple a2 = new Apple();
       a.display();
       a1.display();
       a2.display();
       

	}

}

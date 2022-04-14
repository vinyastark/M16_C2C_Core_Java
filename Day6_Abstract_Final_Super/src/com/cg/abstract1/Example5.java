package com.cg.abstract1;

class Animal
{
	String name="Lion";
}
class Tiger extends Animal
{
	String name="Tiger2";
	void print()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}


public class Example5 {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.print();

	}

}
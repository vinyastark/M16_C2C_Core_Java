package com.cg.abstract1;

class Vegatable
{
	final void accept()
	{
		System.out.print("Vegatable");
	}
}
class Palak extends Vegatable
{
	void accept1()
	{
		System.out.print("Palak");
	}
}
public class Example3 {

	public static void main(String[] args) {
		Palak p=new Palak();
		p.accept1();

	}
}

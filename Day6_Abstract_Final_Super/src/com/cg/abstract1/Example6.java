package com.cg.abstract1;

class Grandparent
{
	void accept()
	{
		System.out.println("Grandparent-2");
	}
}
class Parent1 extends Grandparent
{
	void accept()
	{
		System.out.println("Parent-1");
	}
	void display()
	{
		accept();
		super.accept();
	}
}
public class Example6 {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.display();

	}

}
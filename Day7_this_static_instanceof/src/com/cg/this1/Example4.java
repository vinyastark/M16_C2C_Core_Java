package com.cg.this1;

public class Example4 {

	int p;
	int v;
	Example4()
	{
		p= 50;
		v= 60;	
	}
	Example4 accept() 
	{
		return this;
	}
	void print()
	{
		System.out.println("value of p is : "+p);
		System.out.println("value of v is : "+v);
	}
	public static void main(String[] args) {
		Example4 e = new Example4();
		e.print();
		

	}

}
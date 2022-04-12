package com.cg.oops;

public class Example3 {
	String name ;
	Example3(String name){
		this.name=name ;
	}
	void disply() {
		System.out.println("this is name "+ name );
	}

	public static void main(String[] args) {
		Example3 E1 =new Example3("Apple");
		Example3 E2 =new Example3("Nokia");
		Example3 E3 =new Example3("Samsung");
		E1.disply();
		E2.disply();
		E3.disply();

	}

}
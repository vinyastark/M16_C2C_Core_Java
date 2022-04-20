package com.cg.interface1;

public interface V 
 {
	
	public void print();//Abstract Method

}
class X implements V {
	public void print() {
		
		System.out.println("Welcome to the concept of Interface");
	}

public static void main(String args[]) {
	
	X obj=new X();
	obj.print();
}
}
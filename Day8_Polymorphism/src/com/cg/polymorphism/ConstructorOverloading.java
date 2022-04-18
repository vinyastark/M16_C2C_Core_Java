package com.cg.polymorphism;



 class Maserati 
{
	String color;
	int speed;
	Maserati ()
	{
		System.out.println("Maserati MC20");
	}
	Maserati  (String clr,int s)
	 {
		 color=clr;
		 speed=s;
		 System.out.println("color is "+clr+" "+"speed is "+s+" km/hr");
	 }
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Maserati  r= new Maserati ();
		Maserati  r1 = new Maserati ("black",60);
		

	}

}

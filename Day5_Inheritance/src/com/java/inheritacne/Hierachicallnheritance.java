package com.java.inheritacne;
class Vehicle
{
		void print()
		{
			System.out.println("Vehicle types");
		}
	}
	class Car extends Vehicle
	{
		void display()
		{
			System.out.println("Aston Martin");
		}
	}
	class Bike extends Vehicle
	{
		void display1()
		{
			System.out.println("Ducati225");
		}
	}


	public class Hierachicallnheritance {

		public static void main(String[] args)
		{
			Bike b=new Bike();
			Car c=new Car();
			b.display1();
			c.display();
			b.print();
			

		}

	}
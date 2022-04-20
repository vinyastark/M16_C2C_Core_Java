package com.cg.interface1;

public interface Grandmother
{
	
	void display();
		
	}

interface Grandfather
{
	void display();
	}
class Mother implements Grandmother,Grandfather
{
	public void display() {
		System.out.println("Grandmother");
	}
	public void display1() {
		System.out.println("Grandfather");
	}
	public static void main(String args[]) {
		
		Mother d=new Mother();
		d.display();
		d.display1();
	}
}
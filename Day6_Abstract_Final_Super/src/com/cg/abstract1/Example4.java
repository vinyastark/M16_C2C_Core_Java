package com.cg.abstract1;

class Mobile
{
	final void accept()
	{
		System.out.println("Mobile");
	}
}  

class Example4 extends Mobile
{  
	void run()
	{
		System.out.println("Plays games smoothly");
	}  
  
	public static void main(String args[])
	{  
		Example4 Oneplus= new Example4();  
		 Oneplus.run();
		 Oneplus.accept();
	}
}
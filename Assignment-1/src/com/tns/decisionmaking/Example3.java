package com.tns.decisionmaking;

public class Example3 {

	public static void main(String[] args) {
        int age=25,weight=48;
        //nested if
        if (age>=15)
{
	if (weight>=45)
	{
		if (weight<=110)
		{
			System.out.println("eligible for ride");
		}
		else
		{ 
			System.out.println("extra weight should be added");
			
		}
	}
	else
	{ 
		System.out.println("not eligible for ride");
	}
}
        else
        {
        	System.out.println("not eligible for ride");
        }
	}

}

package com.tns.operator;

import java.util.Scanner;

public class ArithmeticOperator 
{
public static void main(String args[])
  {
    int x, y, add, subtract, multiply;
    float devide;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    x = s.nextInt();
    y = s.nextInt();

    add = x + y;
    subtract = x - y;
    multiply = x * y;
    devide = (float) x / y;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
    s.close();
  }
}
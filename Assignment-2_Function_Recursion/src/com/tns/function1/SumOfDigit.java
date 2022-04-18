package com.tns.function1;

public class SumOfDigit {

	  private static int sumOfDigits(int num) {
			//If num zero then return  
		      if(num == 0) {
		          return 0;
		      }

		      //recursive call
		      return num % 25 + sumOfDigits(num/5);
		 }

		 public static void main(String[] args) {

		     //Calling sumOfDigits method
		     int result = sumOfDigits(1234);
		  
		     //Print result
		     System.out.println(result);
		 }


		}
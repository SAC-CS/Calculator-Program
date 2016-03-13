// Kevin Garnica
// 3/13/2016

import java.util.Scanner;
import java.util.Random;

class Calculate
{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner( System.in );

		
		float numberOne;
		float numberTwo;
		String operation; 
		String operatorUppercase;
		
		System.out.println("Please Input First Number");
		numberOne = input.nextInt();
		System.out.println("Please Input Second Number");
		numberTwo = input.nextInt();
		System.out.println("Do You Want to Add, Subtract, Multiply or Divide.");
		operation = input.next();
		operatorUppercase = operation.toUpperCase();
		if(operatorUppercase.equals("ADD")){
			
			System.out.println("Adding these two numbers equals " + numberOne + numberTwo);
			
		}
		if(operatorUppercase.equals("SUBTRACT")){
			
			System.out.print("Subtracting these two numbers equals " );
			System.out.println( numberOne - numberTwo);
			
		}
		if(operatorUppercase.equals("MULIPLY")){
			
			System.out.print("Muliplying these two numbers equals " );
			System.out.println( numberOne * numberTwo);
			
		}
		if(operatorUppercase.equals("DIVIDE")){
			
			System.out.println("Diving these two numbers equals " + numberOne / numberTwo);
			
		}
	}
	
}

//This works...please see if you can use a single println to print output, reagardless of operator

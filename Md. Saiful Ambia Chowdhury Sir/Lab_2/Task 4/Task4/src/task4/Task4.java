/// LAB 1 - TASK 4
/// SIMPLE CALCULATOR USING SWITCH STATEMENT (C++ VERSION)
package task4;

import java.util.Scanner;

public class Task4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
                
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		System.out.println("\n1. Addition (+).");
		System.out.println("2. Subtraction (-).");
		System.out.println("3. Multiplication (*).");
		System.out.println("4. Division (/).");
		System.out.print("Enter operation number: ");
		int op = input.nextInt(),x;

		//System.out.print("\nThe result is ");
		switch(op)
		{
                    case 1: x = num1+num2;
                            System.out.println("\nThe result is " + x);
                            
                            /** This Line works but I don't know how.
                                System.out.println("\nThe result is " + (num1+num2)); **/
                            
                            break;
                            
                    case 2: x = num1-num2;
                            System.out.println("\nThe result is " + x);
                            break;
                            
                    case 3: x = num1*num2;
                            System.out.println("\nThe result is " + x);
                            break;
                            
                    case 4: float y = (float)num1/num2;
                            System.out.println("\nThe result is " + y);
                            break;
                            
                    default: System.out.println("\nWrong Choice.");
                            break;
		}

	}
}
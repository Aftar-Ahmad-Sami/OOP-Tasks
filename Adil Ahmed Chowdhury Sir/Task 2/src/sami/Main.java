/* 
 * Name: Aftar Ahmad Sami
 * ID: 2012020335
 * Section: 5(G)
 * Email: cse_2012020335@lus.ac.bd
 */

package sami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		
		// Preventing 'inp' resource leak
		try {		
			System.out.print("Enter the Integer for Divisor Summation:\t");
			int n1 = inp.nextInt();
			System.out.println("");
			
			System.out.print("Enter the Integer for Factorial:\t");
			int n2 = inp.nextInt();
			System.out.println("");
			
			MyCalculator calculator = new MyCalculator();
			System.out.println("The Divisor Summation of " + n1 + ":\t" + calculator.divisorSum(n1));
			System.out.println("The Factorial of " + n2 + ":\t" + calculator.findFactorial(n2));
		}
		finally 
		{
			inp.close();
		}
	}

}

import java.util.Scanner;
public class Task4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();

		System.out.println("1. Addition (+).");
		System.out.println("2. Subtraction (-).");
		System.out.println("3. Multiplication (*).");
		System.out.println("4. Division (/).");
		System.out.print("Enter operation number: ");
		int op = input.nextInt();

		System.out.println("\nThe result is ");
		switch(op)
		{
			case 1: System.out.println(num1+num2);
					break;
			case 2: System.out.println(num1-num2);
					break;
			case 3: System.out.println(num1*num2);
					break;
			case 4: System.out.println((float)num1/num2);
					break;
			default: System.out.println("Wrong Choice.");
					 break;
		}

	}
}
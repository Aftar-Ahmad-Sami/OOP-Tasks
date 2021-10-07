package task22;

import java.util.Scanner;
public class Task22{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int pos=0,neg=0;
                System.out.print("Enter 10 integers: ");
		for(int i=0;i<10;i++)
		{
			int n = input.nextInt();
			if(n>-1) pos++;
			else neg++;
		}
		System.out.println("Positive Numbers: " + pos + "\nNegative Numbers: " + neg);
	}
}
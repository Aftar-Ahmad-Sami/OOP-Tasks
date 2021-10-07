import java.util.Scanner;
public class Task2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int pos=0,neg=0;
		for(int i=0;i<10;i++)
		{
			int n = input.nextInt();
			if(n>-1) pos++;
			else neg++;
		}
		System.out.printf("Positive Numbers: " + pos + "\nNegative Numbers: " + neg);
	}
}
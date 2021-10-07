//import java.util.Scanner;
class Task3{
	public static void main(String args[]){
		//Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}
}
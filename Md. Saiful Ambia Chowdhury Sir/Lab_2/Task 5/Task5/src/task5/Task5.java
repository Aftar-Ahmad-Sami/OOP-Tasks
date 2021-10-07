package task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " integers: ");
        
        /// Array Input
        int ary[] = new int[n];
        for(int i=0;i<n;i++) ary[i] = input.nextInt();
        
        //Searching
        int cnt=0;
        System.out.print("Enter the number to ssearch: ");
        int srch = input.nextInt();
        
        /// For-Each Version of the Loop
        for(int x : ary)
        {
            if(x==srch) cnt++;
        }
        
        System.out.println(srch + " occured " + cnt + " times in the array.");
        
        
    }
    
}

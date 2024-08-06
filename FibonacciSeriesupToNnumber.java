// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class FibonacciSeriesupToNnumber    {
    public static void main(String[] args) {
        
       Scanner s1 = new Scanner(System.in);
       System.out.println("Enter a number");
       int n=s1.nextInt();
       int f=0;
       int s=1;
       int num=0;
       for(int i=1;i<=n;i++){
           System.out.print(f+" ");
           num=f+s;
           f=s;
           s=num;
           
       }
        
      
    }
}

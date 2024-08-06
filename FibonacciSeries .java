import java.util.Scanner;
class FibonacciSeries    {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enetr wich number you want the fabbonachio serries");
        int n=s1.nextInt();
        int f=0;
        int s=1;
        
        if(n<=0){
            System.out.println("n can't be zero or negative");
        }else if(n==1){
            System.out.println("The "+n+"th Fibonacci number is: "+f);
        }else if(n==2){
            System.out.println("The "+n+"th Fibonacci number is: "+s);
        }else{
            int crr=0;
            for(int i=3;i<=n;i++){
                crr=f+s;
                f=s;
                s=crr;
            }
            System.out.println("The "+n+"th Fibonacci number is: "+crr);
        }
        
      
    }
}

import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s1.nextInt();
        
        if(num==0){
            System.out.println("it is a "+1+" digit number");
        }else{
            int c=0;
            while(num!=0){
                c++;
                num=num/10;
                
            }
            System.out.println("it is a "+c+" digit number");
        }
        
    }
}

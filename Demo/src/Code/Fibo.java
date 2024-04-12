package Code;
import java.util.Scanner;

public class Fibo {
    public static void main(String[]args){
        System.out.println("Find the Nth fibonacci number..");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int a = 0 ;
        int b = 1;
        int count = 2;
        while(count<n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
            System.out.print(b+" ");
        }

       System.out.println("\n" + n+ "th fibonacci number is "+ b);
    }

}

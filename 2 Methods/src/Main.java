import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("Hello Dheeraj, you've to secure a job soon..");
        // Q: Take input 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        int num1, num2,sum;

        System.out.println("Enter two numbers ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}
package Code;
import java.util.Scanner;
public class CountNumbs {
    public static void main(String[]args){
            Scanner input = new Scanner(System.in);
        System.out.println("Check the frequency of a number..");
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        int n = 1222;
        int rem = 0;
        int count = 0;
        while(n>0){
            rem = n%10;
            if(rem == a){
                count++;
            };
            n /= 10;
        }
        System.out.println(count);
    }
}

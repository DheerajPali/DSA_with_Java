package Code;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        System.out.println("Find the largest one..");
        //Q; get 3 inputs from user and give maximum.

       Scanner input = new Scanner(System.in);
//        System.out.print("Write 3 numbers : ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//
//        int max = num1;
//        if(max < num2){
//            max = num2;
//        }
//        if(max<num3){
//            max = num3;
//        }
//        System.out.println("Maximum number among "+num1 +"," +
//                num2 + " and "+num3 + " is " + max);

        System.out.print("Enter 3 numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = Math.max(c,Math.max(a,b));

        System.out.println("Maximum number among "+a +"," + b + " and "
                +c +" is " + max);
    }
}

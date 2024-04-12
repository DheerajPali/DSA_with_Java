import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
//        String num1 = input.nextLine();
        int num1 = input.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
//        String sum = num1+num2;
        System.out.println("The sum of "+num1 +" and "+ num2+" is "+sum );
    }
}

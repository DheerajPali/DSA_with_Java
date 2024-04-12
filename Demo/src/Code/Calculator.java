package Code;
import java.util.Scanner;

public class Calculator{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator..");

    // Take input from user till user does not press X or x
        int ans = 0;
        while(true){
            System.out.print("Enter an operator: ");
            char op = input.next().trim().charAt(0);

            if(op =='+' || op =='-' || op =='*'|| op=='/' || op=='%'){
                System.out.print("Enter 2 numbers : ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (op == '+') {
                    ans = a+b;
                }
                else if(op=='-'){
                    ans = a-b;
                }
                else if(op=='*'){
                    ans = a*b;
                }
                else if(op=='%'){
                    ans = a%b;
                }
                else{
                    if(b!=0) {
                        ans = a / b;
                    }
                }
                System.out.println(ans);
            }
            else if(op == 'X' || op=='x'){
                System.out.println("You've pressed it");
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
        }
    }
}
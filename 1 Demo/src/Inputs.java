import  java.util.Scanner;
public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your rollno ");
        int rollno = input.nextInt();
        System.out.println("Your rollno is "+ rollno );

        int a = 323_000_000;
        //it will ignore Underscore(_)
        System.out.println(a);
    }
}

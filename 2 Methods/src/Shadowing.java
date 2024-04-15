import java.util.Scanner;

public class Shadowing{
    static int x = 10;
    public static void main(String[]args){
        System.out.println("Welcome to shadowing..");
        System.out.println(x);// will print 10;
        int x = 40; //this will overlap global variable , called shadowing
        System.out.println(x); //40
    }
}
import java.util.Scanner;

public class Greetings{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter your name..");
        String text = in.next();

        String abc =   greetings(text);
        System.out.println(abc);
    }
    static String greetings(String name){
      String message = "Hello "+ name + ", Welcome Dude, keep doing it";
      return message;
    }
}
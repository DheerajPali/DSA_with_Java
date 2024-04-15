package Code;
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args){
        System.out.println("Casecheck ...");

        Scanner input = new Scanner(System.in);

//        char ch = input.next().trim().charAt(0);
//        System.out.println(ch);
//        String str = "hello";
//        System.out.println(str.charAt(3));

        //Q: check weather character is small or capital?

        System.out.print("Enter a character: ");
         char ch = input.next().trim().charAt(0);

         if(ch>='a' && ch<='z'){
             System.out.println("Small Letter");
         }
         else if (ch >='A' && ch <='Z'){
             System.out.println("Capital Letter");
         }
         else{
             System.out.println("Invalid input");
         }
    }
}

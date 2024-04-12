package Code;
import java.util.Scanner;

public class NestedSwitch{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Nested Switch");

        int EmpId = in.nextInt();


        switch(EmpId) {
            case 1 -> System.out.println("Entered 1");
            case 2 ->{
                System.out.println("Please Enter your Department");
                String Dpt = in.next();
                switch(Dpt){
                    case "It" -> System.out.println("IT Dept");
                    default -> System.out.println("Enter a valid dept");
                }
            }
            default -> System.out.println("Please enter a valid id");
        }
    }
}
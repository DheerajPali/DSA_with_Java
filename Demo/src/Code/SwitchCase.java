package Code;
import java.util.Scanner;

public class SwitchCase{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Switch Cases...");
//        System.out.print("Enter your favourite fruit : ");
//        String fruit = in.next();

//        if(fruit.equals("mango")){
//            System.out.println("The king of fruit");
//        }



//        switch (fruit){
//            case "mango":
//                System.out.println("Mango Entered");
//                    break;
//
//            case "apple" :
//                System.out.println("Apple Entered");
//                    break;
//
//            case "graps" :
//                System.out.println("Graps Entered");
//                    break;
//
//            default :
//                System.out.println("no case matched");
//        }


        //New inhenced syntax using alt + Enter
//        switch (fruit) {
//            case "mango" -> System.out.println("Mango Entered");
//            case "apple" -> System.out.println("Apple Entered");
//            case "graps" -> System.out.println("Graps Entered");
//            default -> System.out.println("no case matched");
//        }

        int day = in.nextInt();
        /*switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Webnesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Firday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter enter a valid input;");
        }*/

        switch(day){
            //single output for multiple cases....
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid number");
        }
    }
}
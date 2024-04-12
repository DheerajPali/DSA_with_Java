package Code;

import java.util.Scanner;

public class Loops {
    public static void main(String[]args){
        System.out.println("Loops ");

        /*
        Syntax of for loops:

            for (initialization; condition; updatation){
                // body
            }
         */
        // Q: print 1 to 5
//        for (int num = 1; num<=5; num++){
//            System.out.println(num);
//        }

        //Q: print 1 to n
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number n : ");
//        int n = input.nextInt();
//
//        for (int i = 1; i<=n; i++){
//            System.out.println(i);
//        }

        //while loops

        /*
            Syntax:
               while(condition){
               //body
               //increment
               }
         */
//        int num = 1;
//        while(num<=5){
//            System.out.println(num);
//            num++;
//        }

        // do while loops
        /*
            do{
                //body
                }
            while(condition)

         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        }
        while(n<=5);
    }
}

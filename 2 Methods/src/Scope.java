import java.util.Scanner;
import java.util.Arrays;
public class Scope {
    public static void main(String[]args){
        int a = 10;
        int b = 20;
//        System.out.println(marks);
        {
            a = 100; //we reassigned the value
            System.out.println(a);
        }
        System.out.println(a);
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
    }
}

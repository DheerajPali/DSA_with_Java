import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        System.out.println("Array");
        /*
        Syntax..
        DATATYPE [] NAME = new DATATYPE [size]
         */



        //Q. store roll no of 5 Students..
        /*
        int rollno1 = 1;
        int rolln02 = 2;
        int rollno3 = 3;
        int rollno4 = 4;
        int rollno5 = 5;
         */

        int [] rollno = new int [5];

        // DATATYPE =  int
        // name of array = rollno
        //size of array = 5

        //Or you can directly define.
//        int [] rollnos = {1,2,3,4,5};
//        System.out.println(rollnos[1]);

        int [] ros; //declaration of array. ros is getting defined in the stack
        ros = new int [5]; // intiallization: actually here object is being created in the heap.
        System.out.println(ros[2]); // will print : 0 (by defult int value)

        String [] arr = new String [5];
        System.out.println(arr[3]); //will print : null (by default string value, null is a literal.)

    }
}
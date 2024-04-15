import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);


        //ARRAY OF PRIMITIVES

        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 500;
        arr[3] =49;
        arr[4] = 4;
        // {23,45,500,49,4}
        System.out.println(arr[3]);

        //Input in Array using loops
//        System.out.println("Enter 5 numbers");
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

        //For each loop
//        for(int num : arr){
//            System.out.println(num);
//        }

//        System.out.println(Arrays.toString(arr)); // will add [ and , ...


        // ARRAY OF OBJECTS...

        String [] str = new String [ 4];
        System.out.println("Enter 4 strings");
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}

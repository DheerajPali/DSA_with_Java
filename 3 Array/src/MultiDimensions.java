 import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensions {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        /*
        2-D (rows,columns)
        ex:
            1 2 3
            4 5 6
            7 8 9
         */
//        int[][] arr = new int[3][3]; // rowsize is mendatory
        //OR

//        int[][] arr2D = {
//                // you can take any no. of colums in a row
//                {1,2,3}, //0th index
//                {4,5},   //1st index
//                {6,7,8,9} //2nd index--> arr2D[2] ={6,7,8,9}
//        };


        //INPUT IN 2D ARRRAY

        int [][] arr = new int [3][3];
        System.out.println(arr.length); // no. of rows 3

        for(int row = 0; row < arr.length; row ++){
            System.out.println("Enter row no. " + row);
            for(int col = 0; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // OUTPUT OF 2D ARRAY...

//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//              System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // WAY USING Arrays.toString..
//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //OPTIMISED WAY..
        for(int[] a: arr){
            System.out.println(Arrays.toString(a)); //same result..
        }
    }
}


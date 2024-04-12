import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray{
    public static void main(String[]args){
        System.out.println("Reverse the array using swap");
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.println("Enter the elements of array..");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

//        int [] arr = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
         int [] reverse = reverse(arr);
        System.out.println(Arrays.toString(reverse));


    }
    static int[] reverse(int[]array) {
        if (array.length == 0) {
            System.out.println("Invalid Operation");
        } else {
            int start = 0;
            int end = array.length-1;

            while (start < end) {
                //swap
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return array;
    }
}
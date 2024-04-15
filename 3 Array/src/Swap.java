import java.util.Arrays;

public class Swap{
    public static void main(String[]args){
        System.out.println("Swap 2 indexes of the array.");

        int [] arr = {0,1,2,3,4};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
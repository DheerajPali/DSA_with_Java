import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("Linear Search..");
        int [] arr = {23,45,34,55,34,78};
        int target = 34;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    }

    //Search in the array : if element found , return index number.
    //If not found return -1;
    static int linearSearch(int[] array,int target){
        //verifying that,the given array is not empty.
        if(array.length ==0){
            return -1;
        }
        //Iterating loop from 0th till last index.
        for(int index = 0 ; index < array.length; index++){
            int element = array[index];
            //checking the element is equal to target or not.
            if(element == target){
                return index;
            }
        }

        //if element not found in the array , then this statement will be executed...
        return -1;
    }
}
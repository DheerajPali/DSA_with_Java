import java.util.Arrays;

public class Max{
    public static void main(String[] args) {
        System.out.println("Print max item.");
        int [] arr = {2,34,45,20,70,90};
        System.out.println(max(arr));
        System.out.println("Max value in a range");
        System.out.println(maxRange(arr,3,4));
    }

    //imagine that array is not empty
    static int max(int []array){
        //edge cases..
        if(array.length == 0){
            return -1;
        }
        int maxVal = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i]>maxVal){
                maxVal = array[i];
            }
        }
        return maxVal;
    }

    //MAX VALUE IN SPECIFIC RANGE
    //work on edge cases here, like array being null
    static int maxRange(int []array,int start ,int end){
        //edge cases
        if(end>start){
            return -1;
        }
        if(array.length == 0){
            return -1;
        }
       if(end > array.length || start <0){
           return -1;
       }
        int maxVal = array[0];
        for(int i = start; i <= end; i++){
            if(array[i]>maxVal){
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
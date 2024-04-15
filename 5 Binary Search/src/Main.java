import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
        System.out.println("Hello Dheeraj, keep doing it man..");
        int [] nums = new int []{-23,-4,2,4,5,6,7,9,23,24,35,67,89,99};
        int target = -4 ;
        int ans = binarySearch(nums,target);
        System.out.println("The given number "+target +" is on index no. "+ ans);

    }
    static int binarySearch(int [] array, int target){
        int start = 0;
        int end = array.length-1;
        int count = 0;
        while(start<=end){
            int mid = (start+end)/2;
            count++;
            if(array[mid] ==target){
                System.out.println("total steps taken " +count);
                return mid;
            }
            else if(array[mid]> target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("total render " +count);
        return -1;
    }
}
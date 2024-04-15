import java.util.Arrays;

public class Example {
    public static void main(String[]args){
        //create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        //It will change the value , because it's
        //refering to the same object ....not the value;
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed.
    }
}

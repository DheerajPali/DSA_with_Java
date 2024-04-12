public class FindMin {
    public static void main(String[]args){
        System.out.println("Find the minimum element in given array..");
        int [] arr = {2,3,4,5,1};
        int ans = findMin(arr);
        System.out.println("The min. no in given array is "+ ans);
    }
    static int findMin(int[] array)
    {
        if(array.length ==0)
        {
            return 0;
        }
        int min = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
}

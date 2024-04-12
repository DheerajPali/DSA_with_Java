import java.util.Arrays;

public class SearchIn2DArray{
    public static void main(String[]args)
    {
        System.out.println("Serch in 2D arrays..");
        int [][] arr = {
                {45,23,13},
                {1,34},
                {56,78,89,90}
        };
        int target = 89;
//        String ans = linearSearch(arr,target);
//        System.out.println(ans);
        int [] ans1 = linearSearch1(arr,target); // will return you the array which holds {row,col} of your target..
        System.out.println(Arrays.toString(ans1));
    }


    static int[] linearSearch1 (int[][] array,int target)
    {
       for(int row = 0; row < array.length; row ++ )
       {
           for(int col = 0; col < array[row].length; col ++){
               int element = array[row][col];
               if(element == target){
                   int [] arr = new int []{row,col};
                   return arr;
//                   return new int[]{row,col};
               }
           }
       }
        int [] arr = {-1,-1};
        return arr;
    }
    static String linearSearch(int [][] array, int target)
    {
        if(array.length == 0){
            return "empty array";
        }
        for(int row = 0; row < array.length;row ++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                int element = array[row][col];
                if( element == target){
                    row++;
                    col++;
                    String ans = row +" "+col;

                    return ans;
                }
            }
        }
        return "not found";
    }
}

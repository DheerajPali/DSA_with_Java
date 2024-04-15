public class OrderAgnosticBS{
    public static void main(String[]args){
        System.out.println("Come on man, let do it...");
        int [] nums = new int []{34,23,7,4,3,2};   // Ascending order Array..
//        int []nums = new int []{3,4,5,7,45,67,88,878}; //Descending order array..
        int target = 7;
        int ans = binarySearch(nums,target);
        System.out.println("The given number "+target +" is on index no. "+ ans);

    }
    static boolean checkOrder(int [] array){
        return array[0] < array[array.length-1];
    }

    static int binarySearch(int [] array,int target){
        boolean isAsec = checkOrder(array);

            int start = 0;
            int end =  array.length-1;

            int count = 0; // To check the no. of steps taken to find target, in other words --> TIME COMPLEXITY..

            while(start <= end){
                count ++;
                int mid = start+(end-start)/2;
                    if (array[mid] == target) {
                        System.out.println("total steps taken " +count);
                        return mid;
                    }
                if(isAsec) {
                    if (array[mid] > target) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
                else{
                    if (array[mid] < target) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        System.out.println("total steps taken " +count);
        return -1;
    }
}
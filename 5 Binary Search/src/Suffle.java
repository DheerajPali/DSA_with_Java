import java.util.Arrays;

class Suffle {
    public static void main(String[]args){
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        int [] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        // Interleave the first half and the second half of the array
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

}

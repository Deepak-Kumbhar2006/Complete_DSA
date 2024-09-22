package Poject5;
import java.util.Arrays;
public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int[] ans = new int[nums.length];
        int n = 2;
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
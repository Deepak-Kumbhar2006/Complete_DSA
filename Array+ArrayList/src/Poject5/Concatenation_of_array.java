package Poject5;

import java.util.Arrays;

//a group of things linked together or occurring together in a way that produces a particular result or effect. --- concatenation meanning
public class Concatenation_of_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

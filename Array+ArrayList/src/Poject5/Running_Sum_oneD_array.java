package Poject5;
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

import java.util.Arrays;
public class Running_Sum_oneD_array {
    public static void main(String[] args) {
        int[] nums = {1, 1 ,1, 1, 1};
        int[] ans =  new int[nums.length];
        for (int i = 0; i < 1; i++) {
            ans[i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            ans[1] = nums[i] + nums[i-1];
//            ans[i] = nums[i] + ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
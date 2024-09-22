package Poject5;

import java.util.Arrays;

public class Permutation_Array {
    public static void main(String[] args) {

        int[] nums = {1, 4, 3, 5, 2, 0};
        System.out.println(Arrays.toString(built_array(nums)));


    }
    public static int[] built_array(int[] nums){
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}

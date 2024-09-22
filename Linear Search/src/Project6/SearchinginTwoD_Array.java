package Project6;

import java.util.Arrays;

public class SearchinginTwoD_Array {
    public static void main(String[] args) {
        int [][] arr = {
                {1 , 8, 9,},
                {45, 84, 952, 54},
                {44, 33, 11, 22, 99},
                {18, 96}
        };
        int target = 22;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;  // -- Min value integer can hold
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max ){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

package lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {
            //for each coloum in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        //output1
        for (int row = 0; row < arr.length; row++) {
            //for each coloum in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //output2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]))
            ;
        }
        System.out.println();

        //output3
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
    }
}

package lecture5;

import java.util.Arrays;
import java.util.OptionalInt;

/*
You can have an array of integers, or an array of strings, or an array of arrays,
but you can’t have an array that contains, for example, both strings and integers.
In computer science, compile time is the time it takes to convert a programming language's statements into binary instructions for a processor to execute.
Runtime is the final phase of the program lifecycle in which the machine executes the program's code.
 */
public class oneD_Array {
    public static void main(String[] args) {
        int[] arr = {1 ,2, 3,4,5,6,7,8,9};
//        int[] arr; // Declaration of array
//        arr  = new int[3]; // initialiazaion: Acutally here object is created in the memory
//        System.out.println(ros[2]);
//        String[] arr = new String[4];
//        System.out.println(arr[1]);
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max);
        // 1st way to print array
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 2nd method
        for ( int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        //3rd Method
        System.out.println();
    }
}
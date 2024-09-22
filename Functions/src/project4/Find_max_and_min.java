package project4;

//Define Two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Find_max_and_min {
    public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
        int ans_min  = find_max(20,50,60);
        int ans_max = find_min(50,20,60);
        System.out.println(ans_min);
        System.out.println(ans_max);
    }
    static int find_max(int first, int second, int third){
        int max = first;
        if(second>first){
            max = second;
        } if (third>second) {
            max = third;
        } if (second <= third) {max = third;} else {max=second;}
        return max;
    }
    static int find_min(int first, int second, int third){
        int min = first;
        if(second<first){min = second;}
        else if (third<first){min = third;}
        return min;
    }
}
package Lecture4;

import java.util.Scanner;

public class Returning_value {
    public static void main(String[] args) {
        int ans = add(5,6);
        System.out.println(ans);
        String ans2 = msg("Deepak");
        System.out.println(ans2);
    }


    public static int add(int a, int b){
        return a+b;
    }

    public static String msg(String name){
        return "Hello, "  +  name;
    }

    public static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st no ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd no. ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}

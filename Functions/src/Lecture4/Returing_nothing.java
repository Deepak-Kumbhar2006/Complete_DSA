package Lecture4;

import java.util.Scanner;

public class Returing_nothing {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st no ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd no. ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum = " + sum);
    }
}


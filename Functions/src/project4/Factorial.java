package project4;
/*
Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-

4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
 */

import java.util.Scanner;

public class Factorial {
    Scanner input = new Scanner(System.in);
    static int num;

    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        factorial();
    }
    static int factorial(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to get its factorial");
        num = input.nextInt();
        if(num==0 || num==1){
            System.out.println(1);}
        int count = num;
        while(count!=1){
            count--;
            num = num * count;
        }
        System.out.println(num);
        return num;
    }
}

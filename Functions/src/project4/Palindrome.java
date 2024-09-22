package project4;

import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {

    // Java program to check if a number is Palindrome

    // Function to check Palindrome
    static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n); // if it is true then it will return 1;
        // else if false it will return 0;
    }
    // Driver Code
    public static void main(String args[])
    {
        int n = 7007;
        if (checkPalindrome(n) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
package project4;
/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

import java.util.Scanner;

public class school_Grade {
    public static void main(String[] args) {
        System.out.println("Enter your marks to get the grade");
        Scanner input = new Scanner(System.in);
        while(true) {
            int ans = input.nextInt();
            grade(ans);
        }
    }

    private static int grade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("AA Grade");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB Grade");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB Grade");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC Grade");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("CD Grade");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD Grade");
        } else if (marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("enter marks between 1-100");
        }
    return 0;
    }
}

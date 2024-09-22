package Lecture4;

import java.util.Scanner;

public class Greeting_or_PassbyReference {
    public static void main(String[] args) {
//        String personalized = mygreet("deepak kumbhar");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ");
        String name = input.nextLine();
        String personalized = mygreet(name);
        System.out.println(personalized);
    }
    static String mygreet(String name) {
        String message  = "hello " + name;
        return message;
    }
}
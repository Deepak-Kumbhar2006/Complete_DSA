package project4;

import java.security.KeyStore;
import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class ODD_EVEN {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        odd_even();
    }
    static int odd_even() {
        Scanner input = new Scanner(System.in);
        while (true) {
//            System.out.print("Type 'r' to RESTART the function");
//            System.out.print("Type 's' to STOP the function");
//            String permission = input.nextLine();
//            if(permission=="r") {
//                System.out.println("please Enter a no_ ");
                int num = input.nextInt();
                if (num % 2 == 0) {
                    System.out.print("even");
                }
                else if (num % 2 != 0) {
                    System.out.println("ODD");
                } else {
                    System.out.println("invalid Statement");
                }
//                return num;
            }
//            if (permission=="s"){
//                break;}
        }
//        return 0;

    }

//}
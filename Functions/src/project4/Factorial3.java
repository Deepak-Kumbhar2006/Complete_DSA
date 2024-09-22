package project4;
/*
class FactorialExample2{
 static int factorial(int n){
  if (n == 0)
    return 1;
  else
    return(n * factorial(n-1));
 }
 public static void main(String args[]){
  int i,fact=1;
  int number=4;//It is the number to calculate factorial
  fact = factorial(number);
  System.out.println("Factorial of "+number+" is: "+fact);
 }
}
*/
import java.util.Scanner;
public class Factorial3 {
    static int factorial(int n){
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int count=1;
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt(); //It is number to calculate factorial
        int number = 4;
        count = factorial(number);
        System.out.println("Factorial of " + number+ " is: " + count);
    }
}

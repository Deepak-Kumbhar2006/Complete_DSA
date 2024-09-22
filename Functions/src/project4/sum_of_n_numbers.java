package project4;

import java.util.Scanner;

public class sum_of_n_numbers {
    static int sum(int n){
        int ans = (n*(n+1))/2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));
    }
}

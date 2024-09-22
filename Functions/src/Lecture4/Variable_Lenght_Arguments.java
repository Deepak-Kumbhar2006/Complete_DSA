package Lecture4;

import java.util.Arrays;

public class Variable_Lenght_Arguments {
    public static void main(String[] args) {
//        fun(2,4,5);
        multiple(10, 20, "Deepak", " Sanket", "Samarth");
    }
//    static void multiple(int a,  String ...c,int b) ----This will not work because variable length argument always comes last
    static void multiple(int a, int b, String ...c){

        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
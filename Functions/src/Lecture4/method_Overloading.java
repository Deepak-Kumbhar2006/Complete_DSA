package Lecture4;
// when Tow or more functions have the same name but different argument it is called as function overloading

public class method_Overloading {
    public static void main(String[] args) {
//        fun(69);
//        fun("Deepak");
        int ans = sum(5, 5, 6 );
        System.out.println(ans);

    }
    static void fun(int a){
//        System.out.println("First one");
        System.out.println(a);}

    static void fun(String name){
//        System.out.println("Second one");
        System.out.println(name);}

    static int sum(int a,int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}

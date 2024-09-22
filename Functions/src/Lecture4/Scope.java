package Lecture4;
// anything initialize outside [main scope] you can use/modify inside, but anything initialize inside you cannot use/modify outside
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//        already initialize outside the block in the same method, hencce you cannot initialize again
            a = 78;   // resign the origin value
            System.out.println(a);
            int c = 99;  // value initialize in the block, will remian in the block
        }


//        System.out.println(c);        // cannot use out the block

        //Scopping in for loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }
    }




    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

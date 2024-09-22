package lecture5;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(55);
        list.add(48);
        list.add(75);
        list.add(64);
        list.add(46);
        list.add(645);

        System.out.println(list.contains(48));
        System.out.println(list.size());
        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); //pass index here, list[Index] syntax will not work
        }
        System.out.println(list);
    }
}

package Project6;

import java.util.Arrays;

public class Search_in_String {
    public static void main(String[] args) {
//        int[] nums = {1,5,6,8,9,7,4,-5};
        String name = "Deepak";
        char target = 'e';
        boolean ans  = search(name, target);
        System.out.println(name.length());
        System.out.println(ans);
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

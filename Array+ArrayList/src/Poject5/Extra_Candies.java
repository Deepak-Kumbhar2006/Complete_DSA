package Poject5;
import java.util.Arrays;
import  java.util.List;
public class Extra_Candies {
    int[] candies = {2, 3, 5, 1, 5};
    int extraCandies = 3;
    int[] ans = new int[candies.length];
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 5};
        getMaxValue(candies);

    }

/*
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        String[] display = new String[candies.length];
        for (int i = 0; i <candies.length; i++) {
            ans[i] = candies[i] + extraCandies;
        }
        for (int i = 0; i < candies.length; i++) {
            return ans[i] >getMaxValue(candies)
        }
//            if(ans[i]>getMaxValue(candies)){
//                display[i] = "true";
//            }
//            else {display[i] = "false";}
//        return null;

    }
*/
    public static int getMaxValue(int[] candies){
        int maxvalue = candies[0];
        for (int i = 1; i < candies.length; i++){
            if (candies[i]>maxvalue){
                maxvalue = candies[i];
            }
        }
        System.out.println(maxvalue);
        return maxvalue;
    }
}

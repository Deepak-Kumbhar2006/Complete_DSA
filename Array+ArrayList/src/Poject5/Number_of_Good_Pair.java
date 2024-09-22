package Poject5;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;

public class Number_of_Good_Pair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        numIdenticalPairs(nums);
    }
    public static int numIdenticalPairs(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int cheak = 0;
        while (cheak != 10) {
            int count = 0;
            for (int i = 0; i < nums.length; i++){
                if(cheak==nums[i]){
                    count++;
                }
            }
            int look = (count*(count-1))/2;
            list.add(look);
            cheak++;
        }
        int goal = 0;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            goal = goal + temp;
        }
        System.out.println(goal);
//        System.out.println(list);
        return goal;
    }
}
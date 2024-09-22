package Poject5;
import java.util.ArrayList;
import java.util.Arrays;
public class Richest_customer_wealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i =0;i<accounts.length;i++){
            int temp = 0;
            for(int j = 0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }

    class Solution {
        public int maximumWealth(int[][] accounts) {
            int wealth = 0;
            for(int i=0; i<accounts.length; i++){
                int maxWealth =0;
                for(int j=0; j<accounts[0].length; j++){
                    maxWealth += accounts[i][j];
                }
                if(wealth < maxWealth){
                    wealth = maxWealth;
                }
            }
            return wealth;
            }
        }

}

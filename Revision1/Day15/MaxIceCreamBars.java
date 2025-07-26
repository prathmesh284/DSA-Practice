// 9. Maximum Ice Cream Bars

import java.util.Arrays;

class Solution {
    static int maxIcecream(int[] costs,int coins){
        Arrays.sort(costs);
        int count = 0;
        int cost = 0;
        for(int i = 0; i < costs.length; i++){
            if(cost == coins) return count;

            if(cost <= coins){
                cost += costs[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIcecream(costs,coins));
    }
}

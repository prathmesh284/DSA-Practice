// 16. Maximum Matching of Players With Trainers

import java.util.Arrays;

class Solution {
    static int maxMatchPlayers(int[] players, int[] trainers){
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        int count = 0;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                count++;    
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] players = {4,7,9}, trainers = {8,2,5,8};
        System.out.println(maxMatchPlayers(players,trainers));
    }
}
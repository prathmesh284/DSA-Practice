//Maximum Matching of Players With Trainers
import java.util.Arrays;
class Solution {

    static int maxMatchingPlayers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, count = 0;

        while (i < players.length && j < trainers.length) {
            if (trainers[j] >= players[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }


    public static void main(String[] args) {
        int[] players = {4,7,9};
        int[] trainers = {8,2,5,8};
        System.out.println(maxMatchingPlayers(players,trainers));
    }
}
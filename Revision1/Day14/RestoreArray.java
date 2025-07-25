// 7. Restore the Array From Adjacent Pairs

import java.util.ArrayList;
import java.util.HashSet;
class Solution {

    static ArrayList restoreArray(int[][] adjacentPairs){
        HashSet<Integer> hs = new HashSet<>();

        for (int[] adjacentPair : adjacentPairs) {
            hs.add(adjacentPair[0]);
            hs.add(adjacentPair[1]);
        }

        return new ArrayList<>(hs);
    }
    public static void main(String[] args) {
        int[][] adjacentPairs = {{2,1},{3,4},{3,2}};
        System.out.println(restoreArray(adjacentPairs));
    }
}
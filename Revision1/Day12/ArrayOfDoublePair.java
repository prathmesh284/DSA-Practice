// 4. Array of Doubled Pairs

import java.util.*;

class Solution {
    public static boolean arrayOfDoublePair(int[] arr) {
        Map<Integer, Integer> count = new TreeMap<>(Comparator.comparingInt(Math::abs));
        
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int x : count.keySet()) {
            if (count.get(x) > count.getOrDefault(2 * x, 0)) {
                return false;
            }
            count.put(2 * x, count.getOrDefault(2 * x,0) - count.get(x));
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, 2, -4};
        System.out.println(arrayOfDoublePair(arr)); // Output: true
    }
}

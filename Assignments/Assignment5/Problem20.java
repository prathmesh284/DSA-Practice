//Merge Inte

import java.util.*;

public class Solution {
    static List<List<Integer>> mergeIntervals(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();
        if (intervals.length == 0) return result;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(Arrays.asList(current[0], current[1]));
                current = next;
            }
        }
        result.add(Arrays.asList(current[0], current[1]));
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> merged = mergeIntervals(intervals);
        System.out.println(merged);
    }
}

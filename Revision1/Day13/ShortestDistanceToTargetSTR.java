// 18. Shortest Distance to Target String in a Circular Array

import java.util.ArrayList;

class Solution {
    static int shortestDistance(String[] words, String target, int startIndex){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                al.add(i);
            }
        }

        int min = Integer.MAX_VALUE;

        for(Integer i : al){
            int direct = Math.abs(startIndex - i);
            int circular = words.length - direct;
            min = Math.min(min, Math.min(direct, circular));
        }

        return min;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "i", "am", "leetcode", "hello"};
        String target = "hello";
        int startIndex = 1;

        System.out.println(shortestDistance(words, target, startIndex)); // Output: 1
    }
}

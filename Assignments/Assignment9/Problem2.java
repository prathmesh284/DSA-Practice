//Longest Increasing Subsequence (Recursive)

import java.util.ArrayList;
class Solution {
    static int longestIncreasingSubsequence(int[] arr,int ind,ArrayList<Integer> al){
        if(arr.length == ind){
            return al.size();
        }
        int max1 = 0;
        if(al.isEmpty() || al.get(al.size()-1) < arr[ind]){
            al.add(arr[ind]);
            max1 = longestIncreasingSubsequence(arr,ind+1,al);
            al.remove(al.size()-1);
        }
        int max2 =longestIncreasingSubsequence(arr,ind+1,al);
        return Math.max(max1,max2);
    }
    public static void main(String[] args){
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(longestIncreasingSubsequence(arr, 0, new ArrayList<>()));
    }
}
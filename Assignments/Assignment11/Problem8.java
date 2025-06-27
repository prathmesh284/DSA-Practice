// 8. Sliding Window Maximum Using Stack

import java.util.Stack;
import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> slidingWindowMaximumUsingStack(int[] nums,int k){
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < k){
            if(st.isEmpty() || nums[st.peek()]<nums[i]){
                st.push(i);
            }
            i++;
        }
        for(i = k-1; i < nums.length ; i++){
            if(!st.isEmpty() && st.peek() < i-k+1){
                st.pop();
            }
            if(!st.isEmpty() && nums[i] > nums[st.peek()]) st.push(i);
            al.add(nums[st.peek()]);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ArrayList<Integer> ans = slidingWindowMaximumUsingStack(nums,k);
        System.out.println(ans);
    }
}
//Sliding Window Maximum

import java.util.Deque;
import java.util.LinkedList;

class Solution{
    static int[] slidingWindowMax(int[] nums,int k){

        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int i=0,j=0;
        while(j<nums.length){
            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
                dq.removeLast();
            }
            dq.addLast(j);

            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                ans[i] = nums[dq.peekFirst()];
                if(i == dq.peekFirst()){
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = slidingWindowMax(nums,k);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
// 2. Count Number of Distinct Integers After Reverse Operations

import java.util.HashSet;

class Solution {
    static int distInt(int[] nums){
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
            // System.out.print(nums[i]+" ");
            int rev = reverseNum(nums[i],0);
            hs.add(rev);
            // System.out.println(rev+" ");
        }
        // System.out.println(hs);
        return hs.size();
    }

    static int reverseNum(int num, int reversedNum){
        if(num == 0) return reversedNum;
        // int reminder = num%10;
        // reversedNum = (reversedNum*10) + reminder;
        // return reverseNum(num/10,reversedNum);
        return reverseNum(num/10,(reversedNum*10) + num%10);
    }

    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        System.out.println(distInt(nums));
    }
}
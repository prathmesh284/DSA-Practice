//Subarray Sum Equals K

import java.util.HashMap;
class Solution{
    static int subArray(int[] nums,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int prefixSum = 0;
        for(int i = 0; i< nums.length ; i++){
            prefixSum = prefixSum + nums[i];
            hm.put(prefixSum,i);
        }
        int max = 0;
        for(Integer key1:hm.keySet()){
            for(Integer key2:hm.keySet()){
                if(key2-key1 == k){
                    max = Math.max( hm.get(key2)-hm.get(key1),max);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,3,3,1,2,2,2,1,1,1,1,1,1};int k = 6;
        System.out.println(subArray(nums,k));
    }
}
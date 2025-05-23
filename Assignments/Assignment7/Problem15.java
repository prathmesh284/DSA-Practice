// Most Frequent Even Element

import java.util.HashMap;
class Solution{
    static int mostFreqElement(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]%2 == 0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        // System.out.println(hm);
        int max = 0;
        for(Integer key : hm.keySet()){
            max = Math.max(hm.get(key),max);
        }
        // System.out.println(max);
        for(Integer key : hm.keySet()){
            if(hm.get(key) == max){
                return hm.get(key);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {29,47,21,41,13,37,25,7};
        System.out.println(mostFreqElement(nums));
    }
}
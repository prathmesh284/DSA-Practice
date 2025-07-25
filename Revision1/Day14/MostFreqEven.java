// 6. Most Frequent Even Element

import java.util.HashMap;
class Solution {
    static int mostFreqEven(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        int max = 0, ele = 0;
        for(int key: hm.keySet()){
            if(hm.get(key) > max){
                ele = key;
                max = hm.get(key);
            }else if(hm.get(key) == max && key < ele){
                ele = key;
                max = hm.get(key);
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        System.out.println(mostFreqEven(nums));
    }
}
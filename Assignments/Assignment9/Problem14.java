//Tug of War Partition

import java.util.HashMap;
class Solution {
    static void tugOfWarPartition(int[] nums, int total, int i, int sum, int count, HashMap<Integer,Integer> hm, boolean[] visited){
        if(count == nums.length/2){
            if(!hm.containsKey(total-sum)){
                hm.put(sum, total - sum);
            }
            return;
        }
        if (i >= nums.length) return;

        visited[i] = true;
        tugOfWarPartition(nums, total, i + 1, sum + nums[i], count + 1, hm, visited);
        visited[i] = false;
        tugOfWarPartition(nums, total, i + 1, sum, count, hm, visited);

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        tugOfWarPartition(nums, total, 0, 0, 0, hm, new boolean[nums.length]);
        System.out.println(hm);

        int min = Integer.MAX_VALUE;
        for(Integer key:hm.keySet()){
            min = Math.min(Math.abs(key-hm.get(key)),min);
        }
        System.out.println(min);
    }
}
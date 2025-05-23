// Check if Array is Good
import java.util.HashMap;
class Solution{
    static boolean isGood(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        // System.out.println(hm);

        for(int i = 1; i <= max ; i++){
            if(!hm.containsKey(i) || (i < max && hm.get(i) != 1) || (i == max && hm.get(i) != 2)) return false;
        }

        return true;
    }
    public static void main(String[] args){
        int[] nums = {2, 1, 3};
        System.out.println(isGood(nums));
    }
}
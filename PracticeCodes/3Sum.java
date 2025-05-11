// 3Sum problem: By using brute force approach
import java.util.HashSet;
import java.util.ArrayList;

class Solution{
    static ArrayList<int[]> threeSum(int[] nums){
        ArrayList<int[]> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); 
        for(int i = 0; i< nums.length - 2; i++){
            for(int j = i+1; j< nums.length - 1; j++){
                for(int k = j+1; k< nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0  && (!set.contains(nums[i]) || !set.contains(nums[j]) || !set.contains(nums[k]))){
                        int[] triplet = {nums[i], nums[j], nums[k]};
                        result.add(triplet);
                        set.add(nums[i]);
                        set.add(nums[j]);
                        set.add(nums[k]);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        int[] nums = {-1,0,1,2,-1,-4};
        ArrayList<int[]> result = threeSum(nums);
        for(int[] triplet:result){
            System.out.println(triplet[0] +" "+triplet[1] +" "+triplet[2] +" ");
        }
    }
}
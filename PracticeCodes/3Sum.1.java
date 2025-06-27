// 3Sum problem: By using brute force approach
// import java.util.HashSet;
// import java.util.ArrayList;

// class Solution{
//     static ArrayList<int[]> threeSum(int[] nums){
//         ArrayList<int[]> result = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>(); 
//         for(int i = 0; i< nums.length - 2; i++){
//             for(int j = i+1; j< nums.length - 1; j++){
//                 for(int k = j+1; k< nums.length; k++){
//                     if(nums[i] + nums[j] + nums[k] == 0  && (!set.contains(nums[i]) || !set.contains(nums[j]) || !set.contains(nums[k]))){
//                         int[] triplet = {nums[i], nums[j], nums[k]};
//                         result.add(triplet);
//                         set.add(nums[i]);
//                         set.add(nums[j]);
//                         set.add(nums[k]);
//                     }
//                 }
//             }
//         }
//         return result;
//     }
//     public static void main(String[]args){
//         int[] nums = {-1,0,1,2,-1,-4};
//         ArrayList<int[]> result = threeSum(nums);
//         for(int[] triplet:result){
//             System.out.println(triplet[0] +" "+triplet[1] +" "+triplet[2] +" ");
//         }
//     }
// }

//Time Complexity: O(n^3)
//Space Complexity: O(2*(n/3))




// 3Sum problem: By using 2 HashSet for better approach
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution{
    static ArrayList<ArrayList<Integer>> threeSum(int[] arr){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> set2 = new HashSet<>(); 
        for(int i = 0; i< arr.length; i++){
            HashSet<ArrayList<Integer>> set1 = new HashSet<>(); 
            for(int j = i+1; j< arr.length; j++){
                int third = -(arr[i]+arr[j]);
                if(set2.contains(third)){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(third);
                    Collections.sort(al);
                    set1.add(al);
                }
                set2.add(third);
            }
            System.out.println(set1);
            // for(ArrayList<Integer> al:set1){
            //     result.add(al);
            // }
        }
        return result;
    }
    public static void main(String[]args){
        int[] arr = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> result = threeSum(arr);
        System.out.println(result);
    }
}

//Time Complexity: O(n^2)
//Space Complexity: O(2*(n/3))
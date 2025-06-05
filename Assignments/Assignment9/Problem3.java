//Subsequences with Alternating Signs

import java.util.ArrayList;
class Solution{
    static void alternateSignsSubsequence(int[] arr,int ind,ArrayList<Integer> al){
        if(arr.length == ind){
            if(al.size() > 1){
                System.out.println(al);
            }
            return;
        }
        if(al.isEmpty() || al.get(al.size()-1) < 0 && arr[ind] >= 0 || al.get(al.size()-1) >= 0 && arr[ind] < 0){
            al.add(arr[ind]);
            alternateSignsSubsequence(arr,ind+1,al);
            al.remove(al.size()-1);
        }
        alternateSignsSubsequence(arr,ind+1,al);
    }
    public static void main(String[] args){
        int[] arr = {1, -2, 3, -4};
        alternateSignsSubsequence(arr, 0, new ArrayList<>());
    }
}
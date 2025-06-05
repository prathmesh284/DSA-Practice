// N-Sum Problem (Generalized K-Sum)

import java.util.ArrayList;
class Solution{
    static void kSumCombinations(int[] arr,int sum,int ind,ArrayList<Integer> al,int n, int target){
        if(ind == arr.length){
            if(al.size() == n && sum == target){
                System.out.println(al);
            }
            return;
        }
        al.add(arr[ind]);          
        kSumCombinations(arr,sum+arr[ind],ind+1,al,n,target);       
        al.remove(al.size()-1);  
        kSumCombinations(arr,sum,ind+1,al,n,target);                   
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3,target = 6;
        kSumCombinations(arr,0,0,new ArrayList<>(),n,target);
    }
}
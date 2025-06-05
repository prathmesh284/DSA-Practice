//Partition into K Equal Sum Subsets

import java.util.ArrayList;
class Solution{
    static void kSumSubset(int[] arr,int sum,int ind,ArrayList<Integer> al,int k){
        // if(ind == arr.length){
        //     System.out.println(al);
        //     return;
        // }
        // al.add(arr[ind]);          
        // kSumSubset(arr,sum+arr[ind],ind+1,al,k);      
        // al.remove(al.size()-1);  
        // kSumSubset(arr,sum,ind+1,al,k);                 
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 3, 5, 2, 1};
        int k = 3;
        kSumSubset(arr,0,0,new ArrayList<>(),k);
    }
}
// Print one valid subsequence

import java.util.ArrayList;

class Solution{
    static boolean oneValidSub(int[] arr,int ind,ArrayList<Integer> al, int k,int sum){
        if(ind == arr.length){
            if(sum == k){
                System.out.println(al);
                return true;
            }
            return false;
        }
        al.add(arr[ind]);                
        if(oneValidSub(arr,ind+1,al,k,sum+arr[ind])) return true; 
        al.remove(al.size()-1);           
        if(oneValidSub(arr,ind+1,al,k,sum)) return true;     
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> al = new ArrayList<>();
        oneValidSub(arr,0,al,2,0);
    }
}
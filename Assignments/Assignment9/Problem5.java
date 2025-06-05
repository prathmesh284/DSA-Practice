//Subsets with Given Average

import java.util.ArrayList;
class Solution {
    static void subsetWithAvg(int[] arr,int ind,int sum,ArrayList<Integer> al,double avg){
        if(arr.length == ind){
            if(!al.isEmpty() && ((double) (sum/al.size()) == avg)){
               System.out.println(al);
            }
            return;
        }
        al.add(arr[ind]);
        subsetWithAvg(arr,ind+1,sum+arr[ind],al,avg);
        al.remove(al.size()-1);
        subsetWithAvg(arr,ind+1,sum,al,avg);
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 6};double k = 3.00;
        subsetWithAvg(arr, 0, 0, new ArrayList<>() , k);
    }
}
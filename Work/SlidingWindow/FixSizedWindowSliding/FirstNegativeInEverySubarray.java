// First Negative in every subarray with size K

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static void firstNegativeInSubarray(int[] arr, int k){
        Queue<Integer> que = new LinkedList<>();
        int i = 0,j = 0;
        while(j < arr.length){
            if(arr[j] < 0){
                que.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                if(!que.isEmpty()){
                    System.out.print(que.peek()+" ");
                }
                else{
                    System.out.print(0+" ");
                }
                if(!que.isEmpty() && arr[i] == que.peek()){
                    que.poll();
                }
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,15,30,16,28};
        int k = 3;
        firstNegativeInSubarray(arr,k);
    }
}
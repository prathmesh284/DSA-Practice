//Find missing number in an array

import java.util.Arrays;

class Solution {
    static void missingNumber(int[] num,int n){
        Arrays.sort(num);
        for(int i = 1; i < n; i++){
            if(num[i-1] != i){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {1,2,4,5};
        int n = 5;
        missingNumber(num,n);
    }
}
// Count Equal and Divisible pairs in an array

//By Brute force
class Solution {
    static int countEqualAndDivisible(int[] arr,int k){
        int count = 0;
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] == arr[j] && (i*j)%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};int k=2;
        System.out.println(countEqualAndDivisible(arr,k));
    }
}
//Time Complexity: O(n^2)
//Space Complexity: O(1)

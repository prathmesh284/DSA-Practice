// Maximum Consecutive 1's in Array

class Solution {
    static int maxOne(int[] arr){
        int count = 0 , maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        System.out.println(maxOne(arr));
    }
}
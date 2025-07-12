// Move all zeros to the end of the array

class Solution {
    static void moveZeroToEnd(int[] arr){
        int k = 0;
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0){
                k++;
            }
            else{
                arr[i-k] = arr[i];
            }
        }
        for(int i = arr.length - k; i < arr.length ; i++){
            arr[i] = 0;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        moveZeroToEnd(arr);
    }
}
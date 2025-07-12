//Left Rotate the Array

class Solution{
    static void rotateLeft(int[] arr, int k){
        int[] temp = new int[k];
        System.arraycopy(arr, 0, temp, 0, k);
        for(int i = k; i < arr.length ;i++){
            arr[i-k] = arr[i];
        }
        for(int i = 0 ; i < temp.length ; i++){
            arr[arr.length - k + i] = temp[i];
        }

        // Print Array
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 1;
        rotateLeft(arr,k);
    }
}
//Remove Duplicates in-place from Sorted Array

class Solution {
    static void removeDuplicate(int[] arr){
        int pointer=0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                pointer++;
                arr[pointer] = arr[i];
                System.out.println("Hello");
            }
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        removeDuplicate(arr);
    }
}
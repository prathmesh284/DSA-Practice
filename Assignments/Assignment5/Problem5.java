//Minimum operations to make the Array Increasing.

//Optimal approach
class Solution {
    static int minOperation(int[] arr) {
        int count = 0;
        for(int i = 1;i < arr.length ;i++){
            if(arr[i] <= arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1]+1;
                count += arr[i]-temp;
            }
        }
        return count;
    }
    
    //Time Complexity: O(n)
    //Space Complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 1};
        System.out.println(minOperation(arr));
    }
}
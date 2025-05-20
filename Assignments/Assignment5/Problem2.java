// Find the highest altitude

class Solution {
    static int highestAltitude(int[] arr){
        int sum = 0,max = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(highestAltitude(arr));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)

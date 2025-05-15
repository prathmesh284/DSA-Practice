//Search in sorted 2D matrix

class Solution{
    static boolean isElementPresent(int[][] arr,int low,int high,int index, int target ){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid][0] == target){
                return true;
            }else if(arr[mid][0] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
                index = mid;
            }
            System.out.println("w1");
        }
        low = 0;
        high = arr[0].length -1 ;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[index][mid] == target){
                return true;
            }else if(arr[index][mid] > target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
            System.out.println("w2");
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 1;
        int low = 0;
        int high = arr.length - 1;
        int index = Integer.MAX_VALUE;
        System.out.println(isElementPresent(arr, low, high, index, target));
    }
}

//Time Complexity: O(2logn)
//Space Complexity: O(1)
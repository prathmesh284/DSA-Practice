class Solution {
    static int find(int arr[],int low, int high,int k){
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==k) {
                return mid;
            }
            if (arr[low]<= arr[mid]) {
                if (arr[low]<= k && k<arr[mid]) {
                    high= mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if (arr[high]<= k && k<arr[mid]) {
                    low = mid+1;
                }else{
                    high= mid-1;
                }
            }    
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,8,1,2,3,3,3,4,4,4,4,4,4,4,4,4,4,4,5,6};
        int k=4;
        int low =0;
        int high = arr.length-1;
        int result = find(arr, low, high, k);
        System.out.println(result);
    }
}




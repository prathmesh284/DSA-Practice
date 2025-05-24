class Solution {
   
    static int find(int arr[],int low, int high,int k){
        if (low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid]==k) {
            while (arr[mid-1]==k) {
                mid--;
            }
            return mid;
        }

        if (arr[mid]>k) {
            return find(arr, low, high = mid-1, k);
        }
        if (arr[mid]<k) {
            return find(arr, low = mid+1, high, k);
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] = {1,2,2,2,2,3,4,5,6,7,8,9,10};

        int k=2;
        int low =0;
        int high = arr.length-1;
        int result = find(arr, low, high, k);
        System.out.println(result);
    }
}

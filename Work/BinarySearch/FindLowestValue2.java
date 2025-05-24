class Solution {
    static int find(int arr[],int low, int high,int k){
    int ans=-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>= k) {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
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



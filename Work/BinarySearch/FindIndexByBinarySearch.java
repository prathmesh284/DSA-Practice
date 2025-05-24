class Solution {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k=8;
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>k) {
                high = mid-1;
            }
              if (arr[mid]<k) {
                low =mid+1;
            }
            if(arr[mid]==k){
                System.out.println("k= :"+mid);
            }
        }
     }
}
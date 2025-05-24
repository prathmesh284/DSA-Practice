class Solution {
    static int[] find(int arr[],int low, int high,int k){
    int floor = -1;
    int ceilling = -1;
    int ans[] = new int[2];

        while (low<=high) {
        
            int mid = (low+high)/2;
            if (arr[mid]==k) {
                floor = arr[mid];
                ceilling = arr[mid];
                break;
            }
            if (arr[mid]>= k) {
             
                high = mid-1;
                 ceilling = arr[mid];
                if (mid-1>=0) {
                    floor = arr[mid-1];
                   
                }
            }
            else{
                low = mid+1;
                floor = arr[mid];
                if (mid+1<arr.length) {
                    
                    ceilling =arr[mid+1] ;
                }
            }
            ans[0]= floor;
            ans[1] =ceilling;
        }
        return ans;
    }
    public static void main(String[] args) {
         int arr[] = {1,3,4,4,7,8,10};

        int k=5;
        int low =0;
        int high = arr.length-1;
        int[] result = find(arr, low, high, k);
        System.out.println(result[0]+" "+result[1]);
    }
}




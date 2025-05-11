class MergeSort{
    static void mergeSort(int[] arr,int low,int high){
        if(low == high){
            return ;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeArray(arr,low,mid,high);
    }

    static void mergeArray(int[]arr,int low,int mid,int high){
        int[] temp = new int[high+1];
        int ind = 0;
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[ind] = arr[left];
                ind++;
                left++;
            }else{
                temp[ind] = arr[right];
                ind++;
                right++;
            }
        }
        while(left<=mid){
            temp[ind] = arr[left];
            ind++;
            left++;
        }
        while(right<=high){
            temp[ind] = arr[right];
            ind++;
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp[i - low];
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,9,05,28,8,04};
        int low = 0,high = arr.length-1;
        mergeSort(arr,low,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
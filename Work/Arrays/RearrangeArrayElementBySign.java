class Solution{
    static void rearrange(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0){
                if(arr[i] < 0){
                    int k = i,j=i+1;
                    while(arr[j] < 0 && j < arr.length-1){
                        j++;
                    }
                    while(j > k){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        j--;
                    }
                }
            } else {
                if(arr[i] >= 0){
                    int k = i,j=i+1;
                    while(arr[j] > 0  && j < arr.length-1){
                        j++;
                    }
                    while(j > k){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        j--;
                    }
                }
            }    
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,-4,-5,-6};
        rearrange(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
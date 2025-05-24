//Dutch Notation
public class p20 {
    public static void main(String[] args) {
        int low =0;
        int arr[]={2,0,0,2,0,1,1};

        int high = arr.length-1;
        int mid =0;
        while (mid <=high) {
            if (arr[mid]==0) {
               int temp = arr[mid];
               arr[mid]= arr[low];
               arr[low]= temp;
               mid++;
               low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high]= temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}

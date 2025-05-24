public class p19 {
    public static void main(String[] args) {
        int arr[]={2,0,2,24,0,43,241,0,1,0};
        int i =0;
        int n = arr.length-1;
        int j=n;
        while (j>=0 && i<arr.length) {
            if (arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else{
                j--;
            }
              if (j<i) {
                i++;
                j=n;
            }
            
        }
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }
    }
}

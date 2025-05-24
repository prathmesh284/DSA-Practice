  public class p8{
    public static void main(String[] args) {
 int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
          int n= arr.length;
            int sum = n*(n+1)/2;    
            int arrsum =0;
        
        for (int i = 0; i < arr.length; i++) {
            arrsum+=arr[i];
        }
        int result = sum-arrsum;
        System.out.println(result);
    }
}


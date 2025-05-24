public class p34 {
    public static void main(String[] args) {
           int countedlength =1;
        int arr[] ={3,1,2,4};
        int k= 6;
 
 
    int length=0;
    for (int i = 0; i < arr.length; i++) {
            int sum =0;
        for (int j = i; j < arr.length; j++) {
                sum+= arr[j];
                if (sum==k) {
                    countedlength=j-i+1;

                    length =Math.max(length,countedlength);
                }
        }
    }
    System.out.println(length);
    }
}

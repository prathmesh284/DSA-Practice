public class p31 {
    public static void main(String[] args) {
           int arr[] ={3,1,2,4};
        int k= 6;
       int  count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                    int sum  =0;
                    for (int l = i; l <=j; l++) {
                            sum+= arr[l];
                    }
                    if (sum==k) {
                        count++;
                    }
            
                }
        }
        System.out.println(count);
    }
}

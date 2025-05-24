  public class p7{
    public static void main(String[] args) {
 int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
            int indexsum =0;
            int arrsum =0;
        for (int i = 0; i <= arr.length; i++) {

        indexsum+=i;
       
        }
        for (int i = 0; i < arr.length; i++) {
            arrsum+=arr[i];
        }
        int result = indexsum-arrsum;
        System.out.println(result);
    }
}

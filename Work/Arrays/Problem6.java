public class p6 {
    public static void main(String[] args) {
 int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        for (int i = 1; i <= arr.length; i++) {
            if(arr[i-1]!=i){
                System.out.println(i);
                break;
            }
        }
    }
}

public class p25 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        System.out.println(max-min);
    }
}

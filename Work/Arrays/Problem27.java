public class p27 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    max = Math.max(max, arr[j]-arr[i]);
            }
        }
        System.out.println(max);
    }
}

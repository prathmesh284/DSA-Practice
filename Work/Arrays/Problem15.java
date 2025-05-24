import java.util.*;
public class p15 {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target = 8;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    result.add(arr[i]);
                    result.add(arr[j]);
                }
            }

        }
         for (int num : result) {
            System.out.println(num);
         }

    }
}

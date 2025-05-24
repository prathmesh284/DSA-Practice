import java.util.*;
public class p17 {
   public static void main(String[] args) {
    HashMap<Integer, Integer> hm = new HashMap<>();
     int arr[]={2,6,5,8,11};
        int target = 8;
        int result[] = new int[2];
      
        for (int i = 0; i < arr.length; i++) {
            int x = hm.getOrDefault(target-arr[i], -1);

            if(x!= -1){
                result[0]=arr[i];
                result[1] =arr[x];
            }
            hm.put(arr[i], i);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
   }
        

}

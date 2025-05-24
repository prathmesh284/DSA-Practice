import java.util.*;
public class p13 {
    public static void main(String[] args) {
         int arr[]={1,1,0,3,4,3,4,1};
         HashMap<Integer, Integer> hm = new HashMap<>();
         for (int i = 0; i < arr.length; i++) {
         hm.put(arr[i], hm.getOrDefault(arr[i],0 )+1);
            
         }
         for (int i : hm.keySet()) {
            if (hm.get(i)!= 2) {
                System.out.println(i+":"+hm.get(i));
            }
         }
    }
}

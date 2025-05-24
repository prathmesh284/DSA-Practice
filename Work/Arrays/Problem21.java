import java.util.*;
public class p21 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[]={2,2,1,1,1,2,2};
        int n = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

        }
        for (int i : hm.keySet()) {
            if(hm.get(i)>n/2){
                System.out.println(i+":"+hm.get(i));
            }
        }
    }
} 

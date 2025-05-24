import java.util.HashMap;
public class p33 {
   public static void main(String[] args) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    int prefixsum =0;
        int arr[] ={3,1,2,4};
        int k= 6;
    int count =0;
    hm.put(0, 1);
    
    for (int i = 0; i < arr.length; i++) {
        prefixsum+= arr[i];
        count+= hm.getOrDefault(prefixsum-k, 0);
    hm.put(prefixsum, hm.getOrDefault(prefixsum, 0)+1);
    }
   


    System.out.println(count);
   } 
   
}

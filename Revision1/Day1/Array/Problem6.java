// Find the number that appears once
import java.util.HashMap;
class Solution {
    static int numberAppearOnce(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer i:hm.keySet()){
            if(hm.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1};
        System.out.println(numberAppearOnce(arr));
    }
}
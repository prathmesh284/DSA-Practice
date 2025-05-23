// Find Original Array From Doubled Array
import java.util.HashMap;
class Solution{
    static int[] findOriginalArray(int[] changed){
        HashMap<Integer,Integer> hm = new HashMap<>();
        if(changed.length <= 1 || changed.length%2 == 1) return new int[]{};
        int[] newArr = new int[changed.length /2];

        for(int i = 0; i < changed.length ; i++){
            if(!hm.containsKey((changed[i]+1)/2)&& !hm.containsKey(changed[i])){
                hm.put(changed[i],changed[i]);
            }else if(hm.containsKey(changed[i]/2)&& !hm.containsKey(changed[i])){
                hm.put(changed[i]/2,changed[i]);
            }
        }
        System.out.println(hm);
        int i = 0;
        for(Integer key : hm.keySet()){
            newArr[i++] = key;
        }

        return newArr;
    }
    public static void main(String[] args){
        int[] changed = {1,3,4,2,6,8};
        int[] ans = findOriginalArray(changed);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
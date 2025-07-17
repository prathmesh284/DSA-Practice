// 4. Find the Difference of Two Arrays

import java.util.HashMap;
class Solution {
    static void differenceOfArrays(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            hm.put(arr1[i],1);
        }
        for(int j = 0; j < arr2.length; j++){
            if(!hm.containsKey(arr2[j])){
                hm.put(arr2[j],-1);
            }else{
                hm.put(arr2[j],0);
            }
        }
        System.out.print("[[");
        //Finding difference
        for(Integer i:hm.keySet()){
            if(hm.get(i) == 1){
                System.out.print(i);
            }
        }
        System.out.print("],[");
        for(Integer i:hm.keySet()){
            if(hm.get(i) == -1){
                System.out.print(i);
            }
        }
        System.out.print("]]");
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {2,4,6};
        differenceOfArrays(arr1,arr2);
    }
}
// Pick fruits from tree farm in 2 baskets

import java.util.HashMap;

class Solution {
    static int pickFruits(int[] fruits, int k){
        int i = 0, j = 0;
        int max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        while( j < fruits.length ){

            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);

            if( hm.size() > k ){
                while(hm.size() > k){
                    if(hm.get(fruits[i]) == 1){
                        hm.remove(fruits[i]);
                    }else{
                        hm.put(fruits[i],hm.get(fruits[i])-1);
                    }
                    i++;
                }
            }else{
                max = Math.max(max,j-i+1);
            }

            j++;

        }
        return max;
    }
    public static void main(String[] args) {
        int[] fruits = {1,2,2,3,1,1,3};
        int k = 2;
        System.out.println(pickFruits(fruits,k));
    }
}
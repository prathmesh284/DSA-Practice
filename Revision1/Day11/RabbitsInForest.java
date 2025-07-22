// 20. Rabbits in Forest

import java.util.HashMap;
class Solution {
    static int rabbitsInForest(int[] answers){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < answers.length; i++){
            hm.put(answers[i], hm.getOrDefault(answers[i],0)+1);
        }

        int count = 0;
        for(Integer i : hm.keySet()){
            if(hm.get(i) <= (i+1)){
                count += (i+1);
            }else{
                count += (i*((hm.get(i)/i)+1)+((hm.get(i)/i)+1));
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] answers = {10,10,10,10,10,10,10,10,10,10,10,10};
        System.out.println(rabbitsInForest(answers));
    }
}
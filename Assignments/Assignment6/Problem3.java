// Jewels and Stones

import java.util.HashMap;
class Solution{
    static int jewelsAndStone(String jewels,String stone){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i < stone.length();i++){
            hm.put(stone.charAt(i),hm.getOrDefault(stone.charAt(i),0)+1);
        }
        int sum = 0;
        for(int i = 0;i < jewels.length();i++){
            sum += hm.getOrDefault(jewels.charAt(i),0);
        }
        return sum;
    }
    public static void main(String[] args) {
        // String jewels = "aA",stone = "aAAbbbb";
        String jewels = "z",stone = "ZZZ";
        System.out.println(jewelsAndStone(jewels,stone));
    }
}
// Time Complexity: O(nlog) + O(m)
// Space Complexity: O(n)
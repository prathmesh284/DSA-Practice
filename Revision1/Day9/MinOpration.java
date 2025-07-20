// 2. Minimum Number of Operations to Move All Balls to Each Box

import java.util.ArrayList;
class Solution {
    static int[] minOpr(String boxes){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < boxes.length(); i++){
            if(boxes.charAt(i) ==  '1'){
                al.add(i);
            }
        }
        int[] ans = new int[boxes.length()];
        for(int i= 0; i < boxes.length(); i++){
            int val = 0;
            for(int j = 0; j < al.size(); j++){
                if(i != al.get(j)){
                    val += Math.abs(i-al.get(j));
                }
            }
            ans[i] = val;
        }
        return ans;
    }
    public static void main(String[] args) {
        String boxes = "001011";
        int[] ans = minOpr(boxes);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
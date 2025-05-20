// Find the Score of All Prefixes of an Array
import java.util.HashMap;
class Solution {
    static int findScoresOfPrefix(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0 , 2*arr[0]);
        for(int i = 1; i<arr.length; i++){
            hm.put(i,hm.get(i-1)+2*arr[i]);
        }
        return hm.get(arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,8,16};
        System.out.println(findScoresOfPrefix(arr));
    }
}

//Time Complexity: O(n)
//Space Complexity: O(n)
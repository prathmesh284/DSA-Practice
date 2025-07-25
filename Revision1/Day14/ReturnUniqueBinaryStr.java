// 3. Find Unique Binary String

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static ArrayList<String> nums = new ArrayList<>(Arrays.asList("01", "10"));
    static void uniqueBinary(String ans, int ind){
        if(ind == 2){
            if(!nums.contains(ans)){
                System.out.println(ans);
            }
            return;
        }
        uniqueBinary(ans+"0",ind+1);
        uniqueBinary(ans+"1",ind+1);
    }
    public static void main(String[] args) {
        uniqueBinary("",0);
    }
}
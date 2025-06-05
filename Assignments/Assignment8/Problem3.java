// Find Unique Binary String

import java.util.ArrayList;
class Solution {

    static void findAllStrings(ArrayList<String> ans, int ind, String str, ArrayList<String> al){
        
        if(ind == al.size()){
            if(!al.contains(str)){
                ans.add(str);
            }
            return;
        }

        findAllStrings(ans, ind+1 , str+"1",al);

        findAllStrings(ans, ind+1 , str+"0",al);
    }

    static ArrayList<String> uniqueBinaryString(ArrayList<String> al){
        ArrayList<String> ans = new ArrayList<>();
        findAllStrings(ans,0,"",al);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("01");
        al.add("10");
        System.out.println(uniqueBinaryString(al));
    }
}
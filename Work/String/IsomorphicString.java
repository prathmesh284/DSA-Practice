//Isomorphic String
import java.util.HashMap;
class Solution{
    static boolean isIsomorphic(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                if(hm.containsValue(t.charAt(i))) return false;
                hm.put(s.charAt(i),t.charAt(i));
            }
            if(hm.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        System.out.println(hm);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("dog","bec"));
    }
}
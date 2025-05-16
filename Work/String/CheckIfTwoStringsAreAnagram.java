//Check If Two Strings Are Anagram
import java.util.HashMap;
class Solution{
    static boolean isAnagram(String str1,String str2){
        HashMap<Character,Integer> hm = new HashMap<>();
        if(str1.length() == str2.length()){
            for(int i = 0; i<str1.length() ; i++){
                hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i),0)+1);
            }
            for(int i = 0; i<str2.length() ; i++){
                if(hm.containsKey(str2.charAt(i))){
                    hm.put(str2.charAt(i),hm.get(str2.charAt(i))-1);
                }else{
                    return false;
                }
            }
            for(Character key:hm.keySet()){
                if(hm.get(key) != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("ABA","ABB"));
    }
}
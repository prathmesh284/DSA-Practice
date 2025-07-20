// 7. Check if the Sentence Is Pangram

class Solution {
    static boolean isPanagram(String str){
        int[] ch = new int[26];
        for(int i = 0; i < str.length(); i++){
            ch[str.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(str));
    }
}
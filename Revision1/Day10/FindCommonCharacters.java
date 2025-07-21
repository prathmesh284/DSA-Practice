// 12. Find Common Characters

import java.util.ArrayList;

class Solution {
    static ArrayList<Character> findCommonCharacters(String[] words){
        int[] ch = new int[words[0].length()];
        for(int i = 0; i < words[0].length(); i++){
            ch[i] = 1;
        }
        for(int chh = 0; chh < ch.length; chh++){
            for(int i = 1; i < words.length; i++){
                if(!words[i].contains(""+words[0].charAt(chh))){
                    ch[chh] = 0;
                    break;
                }else{
                    ch[chh] = 1;
                }
            }
        }
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 1){
                al.add(words[0].charAt(i));
            }
        }
        return al;
    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(findCommonCharacters(words));
    }
}
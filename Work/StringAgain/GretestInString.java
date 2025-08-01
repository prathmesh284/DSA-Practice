// find greatest character in string


import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    static char greatestChar(String str){
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> al = new ArrayList<>();
        al.add(' ');

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch) && set.contains(Character.toUpperCase(ch))){
                al.add(Character.toUpperCase(ch));
            }else if(!Character.isLowerCase(ch) && set.contains(Character.toLowerCase(ch))){
                al.add(Character.toUpperCase(ch));
            }
            set.add(ch);
        }
        
        Collections.sort(al);

        return al.get(al.size()-1);
    }

    public static void main(String[] args) {
        String str = "arRAxFif";
        System.out.println(greatestChar(str));
    }
}


// import java.util.HashSet;
// class Solution {
//     static char gretestChar(String str){
//         HashSet<Character> set = new HashSet<>();

//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             if(Character.isLowerCase(ch)){
//                 if(set.contains(Character.toUpperCase(ch))){
//                     return Character.toUpperCase(ch);
//                 }
//                 set.add(ch);
//             }else{
//                 if(set.contains(Character.toLowerCase(ch))){
//                     return Character.toUpperCase(ch);
//                 }
//                 set.add(ch);
//             }
//         }

//         return ' ';
//     }
//     public static void main(String[] args) {
//         String str = "arRAxFif";
//         System.out.println(gretestChar(str));
//     }
// }
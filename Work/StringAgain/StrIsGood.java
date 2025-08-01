// Minimum number of deletions to make string charcters with unique value.

import java.util.HashMap;
import java.util.HashSet;
class Solution {
    static int noOfDeletion(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0)+1);
        }
        int counter = 0;
        for(Integer value:hm.values()){
            if(!set.contains(value)){
                set.add(value);
            }else{
                while(value >= 0 && set.contains(value)){
                    value--;
                    counter++;

                }
                if(value > 0) set.add(value);
            }
        }
        return counter;
    }
    public static void main(String[] args){
        // String str = "abbacca";
        String str = "aaabbbcc";
        System.out.println(noOfDeletion(str));
    }
}


// import java.util.HashMap;
// import java.util.HashSet;

// class Solution {
//     static int noOfDeletion(String str) {
//         HashMap<Character, Integer> hm = new HashMap<>();
//         HashSet<Integer> usedFrequencies = new HashSet<>();
//         int deletions = 0;

//         // Count frequency of each character
//         for (char c : str.toCharArray()) {
//             hm.put(c, hm.getOrDefault(c, 0) + 1);
//         }

//         for (int freq : hm.values()) {
//             while (freq > 0 && usedFrequencies.contains(freq)) {
//                 freq--;    // Delete one occurrence
//                 deletions++;
//             }
//             if (freq > 0) {
//                 usedFrequencies.add(freq);
//             }
//         }

//         return deletions;
//     }

//     public static void main(String[] args) {
//         String str = "aaabbbcc";
//         System.out.println(noOfDeletion(str));  // Output: 2
//     }
// }

// Add Spaces in string

class Solution {
    static String addSpaces(String str,int[] spaces){
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for(int i = 0; i < str.length(); i++){
            if(ind<spaces.length && i == spaces[ind]){
                sb.append(" ");
                ind++;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(str,spaces));
    }
}

// class Solution {
//     static String addSpaces(String str,int[] spaces){
//         String s = "";
//         int ind = 0;
//         for(int i = 0; i < str.length(); i++){
//             if(ind<spaces.length && i == spaces[ind]){
//                 s += " ";
//                 ind++;
//             }
//             s += str.charAt(i);
//         }
//         return s;
//     }
//     public static void main(String[] args){
//         String str = "LeetcodeHelpsMeLearn";
//         int[] spaces = {8,13,15};
//         System.out.println(addSpaces(str,spaces));
//     }
// }
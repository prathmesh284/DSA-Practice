// 11. Adding Spaces to a String

class Solution{
    static String addSpaces(String s,int[] spaces){
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for(int i = 0; i < s.length(); i++){
            if(ind < spaces.length && i == spaces[ind]){
                sb.append(" ");
                ind++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }
}
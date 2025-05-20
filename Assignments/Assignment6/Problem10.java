//  Determine if String Halves Are Alike

class Solution {
    static boolean isHalvesAreAlike(String s){
        int count1 = 0,count2 = 0;
        for(int i = 0; i < s.length()/2 ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                count1++;
            }
            if(s.charAt(s.length()-1-i) == 'a'|| s.charAt(s.length()-1-i)== 'e' || s.charAt(s.length()-1-i) == 'i' || s.charAt(s.length()-1-i) == 'o' || s.charAt(s.length()-1-i) == 'u' || s.charAt(s.length()-1-i) == 'A'|| s.charAt(s.length()-1-i)== 'E' || s.charAt(s.length()-1-i) == 'I' || s.charAt(s.length()-1-i) == 'O' || s.charAt(s.length()-1-i) == 'U'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.print(isHalvesAreAlike(s));
    }
}
// Time Complexity: O(n/2)  
// Space Complexity: O(1)
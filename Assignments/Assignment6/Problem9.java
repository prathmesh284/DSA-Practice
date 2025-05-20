//Number of Strings That Appear as Substrings in Word

class Solution {
    static int numOfStrings(String[] patterns, String word){
        int count = 0;
        for(String str:patterns){
            if(word.contains(str)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"}; String word = "aaaaabbbbb";
        System.out.print(numOfStrings(patterns,word));
    }
}
// Time Complexity: O(nlogn)  
// Space Complexity: O(1)
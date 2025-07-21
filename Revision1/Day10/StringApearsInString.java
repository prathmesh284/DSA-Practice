// 9. Number of Strings That Appear as Substrings in Word

class Solution {
    static int appearsInString(String[] patterns,String word){
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(appearsInString(patterns,word));
    }
}
// 4. Maximum Number of Words Found in Sentences

class Solution {
    static int maxNum(String[] sentences){
        int max = 0;
        for (String sentence : sentences) {
            int count = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) == ' '){
                    count++;
                }
                max = Math.max(max,count+1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(maxNum(sentences));
    }
}
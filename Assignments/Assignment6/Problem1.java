//Score of a string

class Solution{
    static int scoreOfString(String str){
        int sum = 0;
        for(int i = 1; i<str.length();i++){
            int max = Math.max(str.charAt(i),str.charAt(i-1));
            int min = Math.min(str.charAt(i),str.charAt(i-1));
            sum += Math.subtractExact(max,min);
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
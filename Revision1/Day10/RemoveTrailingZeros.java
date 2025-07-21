// 11. Remove Trailing Zeros From a String

class Solution {
    static String removeTrailingZeros(String num){
        int last = 0;
        for(int i = num.length()-1; i >= 0; i--){
            if(num.charAt(i) != 0){
                last = i;
                break;
            }
        }
        return num.substring(0,last-1);
    }
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }
}
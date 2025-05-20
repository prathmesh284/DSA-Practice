//Remove Trailing Zeros From a String

class Solution {
    static String removeTrailingZeros(String num){
        int index = 0;
        for(int i = num.length()-1; i >= 0; i--){
            if(num.charAt(i) != '0'){
                index = i;
                break;
            }
        }
        return num.substring(0,index+1);
    }
    public static void main(String[] args) {
        String num = "51230100";
        System.out.print(removeTrailingZeros(num));
    }
}
// Time Complexity: O(n)  
// Space Complexity: O(1)
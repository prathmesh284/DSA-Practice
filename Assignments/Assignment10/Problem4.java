// 4. Check if The Number is Fascinating

class Solution {
    static boolean isFascinating(int n){
        String str = n+""+n*2+""+n*3;
        int[] freq = new int[10];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)-'0'] += 1;
        }
        for(int i = 1; i < freq.length ; i++){
            if(freq[i] != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 192;
        System.out.println(isFascinating(n));
    }
}
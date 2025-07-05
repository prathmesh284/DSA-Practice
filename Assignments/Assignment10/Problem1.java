// 1. Power of Three

class Solution {
    static boolean isPower(int n){
        int i = 1;
        while (true) { 
            if((int) Math.pow(i,3) == n){
                return true;
            }else if((int) Math.pow(3,i) > n){
                return false;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPower(n));
    }
}
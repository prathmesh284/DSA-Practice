// 2. Find the Highest Altitude

class Solution {
    static int highestAltitude(int[] gain){
        int[] ans  = new int[gain.length+1];
        ans[0] = 0;
        int max = 0;
        for(int i=0; i < gain.length; i++){
            ans[i+1] = ans[i] + gain[i];
            max = Math.max(max,ans[i+1]);
        }
        return max;
    }
    public static void main(String[] args){
        // int[] gain = {-5,1,5,0,-7};
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(highestAltitude(gain));
    }
}
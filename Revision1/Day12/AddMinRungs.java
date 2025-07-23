// 5. Add Minimum Number of Rungs

class Solution {
    static int minRungs(int[] rungs, int dist){
        int count = (rungs[0] - 0)/dist;
        for(int i = 1; i < rungs.length; i++){
            if((rungs[i] - rungs[i-1]) > dist){
                count += ((rungs[i] - rungs[i-1])/dist);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] rungs = {1,3,5,10};
        int dist = 2;
        System.out.println(minRungs(rungs,dist));
    }
}
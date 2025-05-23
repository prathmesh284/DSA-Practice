//Add Minimum Number of Rungs

class Solution{
    static int addMinRungs(int[] rungs,int dist){
        int count = 0;
        if(Math.abs(rungs[0] - 0) > dist){
            count = count + Math.abs(rungs[0] - 1)/dist;
        }
        for(int i = 1; i < rungs.length ; i++){
            if(Math.abs(rungs[i] - rungs[i-1]) > dist){
                count = count + Math.abs(rungs[i] - rungs[i-1])/dist;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] rungs = {1,3,5,10};int dist = 2;
        // int[] rungs = {3,6,8,10};int dist = 3;
        // int[] rungs = {3,4,6,7};int dist = 2;
        System.out.println(addMinRungs(rungs,dist));
    }
}
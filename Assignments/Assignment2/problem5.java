class Solution{
    static int maxNum(int[] nums,int index){
        if(index >= nums.length) return 0;
        return Math.max(nums[index], maxNum(nums,index+1));
    }
    public static void main(String[] args) {
        int[] nums = {2,5,9,1,6};
        System.out.println(maxNum(nums,0));
    }
}
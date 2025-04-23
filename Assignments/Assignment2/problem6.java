class Solution{
    static boolean isSorted(int[] nums,int index){
        if(index >= nums.length) return true;
        else if(nums[index-1] >= nums[index]) return false;
        return isSorted(nums, index+1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(isSorted(nums,1));
    }
}
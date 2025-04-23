class Solution{
    static int firstOccurance(int[] nums,int index, int key){
        if(index == nums.length) return -1;
        else if(nums[index] == key){
            return index;
        }
        return firstOccurance(nums, index+1, key);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,7,1,6};int key=7;
        System.out.println(firstOccurance(nums,0,key));
    }
}
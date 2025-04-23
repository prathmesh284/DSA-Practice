class Solution{
    static int lastOccurance(int[] nums,int index, int key){
        if(index < 0) return -1;
        else if(nums[index] == key){
            return index;
        }
        return lastOccurance(nums, index-1, key);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,7,1,6};int key=7;
        System.out.println(lastOccurance(nums,nums.length-1,key));
    }
}
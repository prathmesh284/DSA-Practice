// Rearrange Array by Sign

class Solution {
    static int[] rearrangeArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if((i%2 == 0 && nums[i]>0)||(i%2 != 0 && nums[i]<0)){
            }else{
                if(i%2 == 0 && nums[i]<0){
                    int k = i,temp = nums[i];
                    while(nums[k] < 0){
                        nums[k] = nums[k+1];
                        k++;
                    }
                    nums[k] = temp;
                }else if(i%2 != 0 && nums[i]>0){
                    int k = i,temp = nums[i];
                    while(nums[k] > 0){
                        nums[k] = nums[k+1];
                        k++;
                    }
                    nums[k] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,-3,-1,-2,3};
        int[] ans = rearrangeArray(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
// 7. Partition Array According to Given Pivot

class Solution {
    static int[] partition(int[] nums,int pivot){
        int pvtInd = nums.length-1;
        int i = 0;
        while(i < nums.length){
            if(i == pvtInd) break;
            if(nums[i] > nums[pvtInd]){
                int temp = nums[i];
                int j = i;
                while(j < nums.length-1){
                    nums[j] = nums[j+1];
                    j++;
                }
                nums[j] = temp;
                pvtInd--;
            }else if(nums[i] == nums[pvtInd]){
                int temp = nums[i];
                int j = i;
                while(j < pvtInd){
                    nums[j] = nums[j+1];
                    j++;
                }
                pvtInd--;
                nums[j] = temp;
            }else if(nums[i] < nums[pvtInd]){
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        // int[] nums = {9,12,5,10,14,3,10};
        // int pivot = 10;
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        int[] ans =  partition(nums,pivot);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
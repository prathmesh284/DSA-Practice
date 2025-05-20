//Partition Array according to given pivot

class Solution {

    static int[] partition(int[] arr, int pivot) {
        int[] nums = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (num < pivot) {
                nums[index++] = num;
            }
        }

        for (int num : arr) {
            if (num == pivot) {
                nums[index++] = num;
            }
        }

        for (int num : arr) {
            if (num > pivot) {
                nums[index++] = num;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2,10,9,8,5,1,2,3};int pivot = 5;;
        int[] nums = partition(arr,pivot);
        for(int i = 0; i<nums.length ; i++){
            System.out.println(nums[i]);
        }
    }

}

//Time Complexity: O(3n)
//Space Complexity: O(n)
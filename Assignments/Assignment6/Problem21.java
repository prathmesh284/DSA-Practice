//Count of Interesting Subarray
class Solution {
    static int interestingSubArray(int[] nums, int modulo, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % modulo == k) && (i % modulo == k)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,9,6};int modulo = 3, k = 0;
        System.out.println(interestingSubArray(nums,modulo,k));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

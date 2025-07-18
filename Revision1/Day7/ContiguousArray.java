// class Solution {
//     static int longestEqualZeroOneBlock(int[] nums) {
//         int maxLen = 0;
//         int i = 0;

//         while (i < nums.length - 1) {
//             int count0 = 0, count1 = 0;

//             // count 0s
//             while (i < nums.length && nums[i] == 0) {
//                 count0++;
//                 i++;
//             }

//             // count 1s immediately after 0s
//             int j = i;
//             while (j < nums.length && nums[j] == 1) {
//                 count1++;
//                 j++;
//             }

//             // if at least one 0 and one 1
//             if (count0 > 0 && count1 > 0) {
//                 maxLen = Math.max(maxLen, 2 * Math.min(count0, count1));
//             }

//             // move i to j to continue checking next group
//             i = j;
//         }

//         return maxLen;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 0, 1, 0, 0};
//         System.out.println(longestEqualZeroOneBlock(nums));  // Output: 4
//     }
// }


class Solution {
    static int longestEqual01Block(int[] nums) {
        int maxLen = 0;
        int prevGroupCount = 0;
        int i = 0;

        while (i < nums.length) {
            int currVal = nums[i];
            int count = 0;

            // Count the size of current group (either 0s or 1s)
            while (i < nums.length && nums[i] == currVal) {
                count++;
                i++;
            }

            // After counting current group, compare with previous group
            maxLen = Math.max(maxLen, 2 * Math.min(prevGroupCount, count));

            // Update for next group comparison
            prevGroupCount = count;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 0, 1, 1, 1};
        System.out.println(longestEqual01Block(nums)); // Output: 4
    }
}

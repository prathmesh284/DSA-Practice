// Contigous Array
class Solution {
    static int contigousArray(int[] nums) {
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            int count0 = 0, count1 = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) count0++;
                else count1++;

                if (count0 == count1) {
                    maxLen = Math.max(maxLen, j - i + 1);
                    break;
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,0,0,0,1,1,1,0};
        System.out.println(contigousArray(nums));
    }
}
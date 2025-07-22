// 17. Minimum Limit of Balls in a Bag

class Solution {
    static public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num); // Set initial right bound
        }
        
        int answer = right;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (operationsRequired(nums, mid) <= maxOperations) {
                answer = mid;          // Valid penalty, try smaller
                right = mid - 1;
            } else {
                left = mid + 1;        // Too many operations, try larger penalty
            }
        }
        return answer;
    }
    
    static private int operationsRequired(int[] nums, int penalty) {
        int ops = 0;
        for (int num : nums) {
            ops += (num - 1) / penalty;  // How many splits needed for each bag
        }
        return ops;
    }

    public static void main(String[] args) {
        int[] nums = {9};
        int maxOperations = 2;
        System.out.println(minimumSize(nums,maxOperations)); 
    }
}
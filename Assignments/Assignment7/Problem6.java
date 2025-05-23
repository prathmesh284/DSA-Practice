//Median of Two Sorted Arrays

class Solution{
    static Float mergeAndFindMedian(int[] nums1,int[] nums2){
        Float count = 0.f;
        for(int i = 0; i < nums1.length ; i++){
            count += nums1[i];
        }
        for(int i = 0; i < nums2.length ; i++){
            count += nums2[i];
        }
        return count/(nums1.length + nums2.length);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(mergeAndFindMedian(nums1,nums2));
    }
}
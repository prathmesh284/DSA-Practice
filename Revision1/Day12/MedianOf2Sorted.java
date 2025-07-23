// 6. Median of Two Sorted Arrays

class Solution {
    static double median(int[] nums1,int[] nums2){
        int[] ans = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int ind = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                ans[ind] = nums1[i];
                i++;
            }else{
                ans[ind] = nums2[j];
                j++;
            }
            ind++;
        }
        while(i < nums1.length){
            ans[ind] = nums1[i];
            i++;
            ind++;
        }
        while(j < nums2.length){
            ans[ind] = nums2[j];
            j++;
            ind++;
        }

        if(ans.length%2 == 1) return ans[ans.length/2];
        else{
            return (double)(ans[ans.length/2 - 1] + ans[ans.length/2])/2;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3}, nums2 = {2,4};
        System.out.print(median(nums1,nums2));
    }
}
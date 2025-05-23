// Type of Triangle

class Solution{
    static String typeOfTriangle(int[] nums){
        if(nums[0] == nums[1] && nums[1] == nums[2] && nums[0] == nums[2]) return "equilateral";
        else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";
        else return "scalene";
    }
    public static void main(String[] args) {
        int [] nums = {3,3,3};
        // int [] nums = {3,4,5};
        System.out.println(typeOfTriangle(nums));
    }
}
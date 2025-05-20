// Minimum Operations to Make Binary Array Elements Equal to One I

class Solution {
    static int makeEqualToOne(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] == 0) {
                for (int j = 0; j < 3; j++) {
                    if(arr[i + j] == 0){
                        arr[i + j] = 1;
                    }else{
                        arr[i + j] = 0;
                    }
                }
                count++;
            }
        }
        for (int val : arr) {
            if (val == 0) {
                return -1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1};
        System.out.println(makeEqualToOne(arr));
    }
}

//Time Complexity: O(3n)
//Space Complexity: O(1)

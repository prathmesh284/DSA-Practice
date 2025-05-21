//Third Max Number
class Solution {
    static int thirdMaxNumber(int[] arr) {
        int n = arr.length;
        int firstMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            firstMax = Math.max(firstMax, arr[i]);
        }

        int secondMax = Integer.MIN_VALUE;
        boolean foundSecond = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] < firstMax) {
                secondMax = Math.max(secondMax, arr[i]);
                foundSecond = true;
            }
        }

        if (!foundSecond) return firstMax;

        int thirdMax = Integer.MIN_VALUE;
        boolean foundThird = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] < secondMax) {
                thirdMax = Math.max(thirdMax, arr[i]);
                foundThird = true;
            }
        }
        return foundThird ? thirdMax : firstMax;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};
        System.out.println(thirdMaxNumber(arr));
    }
}

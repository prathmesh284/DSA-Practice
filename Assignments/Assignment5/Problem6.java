//Lucky Numbers in a Matrix

import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> luckyNumber(int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int[] arr1 : arr) {
            int minInRow = arr1[0];
            int colIndex = 0;
            for(int j = 1; j < arr[0].length; j++) {
                if (arr1[j] < minInRow) {
                    minInRow = arr1[j];
                    colIndex = j;
                }
            }
            boolean isLucky = true;
            for(int[] arr2 : arr) {
                if (arr2[colIndex] > minInRow) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(minInRow);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(luckyNumber(arr));
    }
}

//Time Complexity: O(n*(n+m))
//Space Complexity: O(n)